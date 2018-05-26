package com.example.tejinderluna.quizmania;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener,
        GoogleApiClient.OnConnectionFailedListener{
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final int RC_SIGN_IN_CODE = 9001;
    private GoogleApiClient mgac;
    private ProgressDialog mpd;
    private SignInButton btnSignIn;
    private Button btnContinue;
    private MenuItem btnSignOut;
    private ImageView imgProfilePic;
    GoogleSignInOptions gso;
    String name,email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        btnSignIn =  (SignInButton) findViewById(R.id.btn_sign_in);
        btnSignOut = (MenuItem)findViewById(R.id.logout);
        btnContinue = (Button)findViewById(R.id.btn_continue);
        imgProfilePic = (CircleImageView) findViewById(R.id.user_profile_photo);
        btnSignIn.setOnClickListener(this);
        btnContinue.setOnClickListener(this);
        btnContinue.setVisibility(View.GONE);
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mgac = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this)
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
        // Build a GoogleSignInClient with the options specified by gso.*/
       // mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        btnSignIn.setSize(SignInButton.SIZE_STANDARD);
       // btnSignIn.setScopes(gso.getScopeArray());
    }

   public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.quizmenu,menu);
        return true;
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_sign_in:
                signInToGoogle();
                break;
            case R.id.btn_continue:
                Intent intent = new Intent(this, Quiz_Categories_Activity.class);
                Bundle b =new Bundle();
                b.putString("name",name);
                b.putString("email",email);
                intent.putExtras(b);
                startActivity(intent);

        }

    }
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
    }
    private void signInToGoogle() {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mgac);
        startActivityForResult(signInIntent, RC_SIGN_IN_CODE);
    }
   public void signOutFromGoogle() {
        Auth.GoogleSignInApi.signOut(mgac).setResultCallback(
                new ResultCallback<Status>() {
                    @Override
                    public void onResult(Status status) {
                        updateUI(false);
                    }
                });
    }

    private void handleSignInResult(GoogleSignInResult result /*Task<GoogleSignInAccount> completedTask*/) {
        //Log.d(TAG, "handleSignInResult:" + result.isSuccess());
        if (result.isSuccess()) {
            // Signed in successfully, show authenticated UI.
            GoogleSignInAccount acct = result.getSignInAccount();
            Log.e(TAG, "display name: " + acct.getDisplayName());
            name = acct.getDisplayName();
            String photoUrl = acct.getPhotoUrl().toString();
            email = acct.getEmail();
            Log.e(TAG, "Name: " + name + ", email: " + email
                    + ", Image: " + photoUrl);
            if(photoUrl != null) {
                    Glide.with(this).load(photoUrl).into(imgProfilePic);
            }
            updateUI(true);
        } else {
            updateUI(false);
        }
    }
    private void updateUI(boolean flag) {
        if (flag/*account != null*/) {
            btnSignIn.setVisibility(View.GONE);
            btnContinue.setVisibility(View.VISIBLE);
        } else {
            btnSignIn.setVisibility(View.VISIBLE);
            btnContinue.setVisibility(View.GONE);
            imgProfilePic.setImageDrawable(null);
            imgProfilePic.setBackgroundResource(R.drawable.ic_person_add_black_24dp);
        }
    }
   private void showProgress() {
        if (mpd == null) {
            mpd = new ProgressDialog(this);
            mpd.setMessage(getString(R.string.loading));
            mpd.setIndeterminate(true);
        }

        mpd.show();
    }
    private void hideProgress() {
        if (mpd != null && mpd.isShowing()) {
            mpd.hide();
        }
    }
    @Override
    public void onActivityResult(int reqCode, int resCode, Intent data) {
        super.onActivityResult(reqCode, resCode, data);
        if (reqCode == RC_SIGN_IN_CODE) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);

        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        signOutFromGoogle();
        return true;
    }
    public void onStart() {
        super.onStart();
       OptionalPendingResult<GoogleSignInResult> opr = Auth.GoogleSignInApi.silentSignIn(mgac);
        if (opr.isDone()) {
            Log.d(TAG, "Got cached sign-in");
            GoogleSignInResult result = opr.get();
            handleSignInResult(result);
        } else {
            showProgress();
            opr.setResultCallback(new ResultCallback<GoogleSignInResult>() {
                @Override
                public void onResult(GoogleSignInResult googleSignInResult) {
                    hideProgress();
                    handleSignInResult(googleSignInResult);
                }
            });
        }
    }
}
