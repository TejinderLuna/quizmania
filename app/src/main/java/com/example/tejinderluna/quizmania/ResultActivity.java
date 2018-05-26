package com.example.tejinderluna.quizmania;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Tejinder Luna on 12/26/2017.
 */

public class ResultActivity extends Activity implements
        View.OnClickListener {
    int score;
    String name,email;
    Button retry,share;
    TextView result;
    LinearLayout ll;
    File imagePath;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        Bundle b = getIntent().getExtras();
        score =b.getInt("score");
        name =(String)b.getCharSequence("name");
        email = (String)b.getCharSequence("email");
        retry = (Button)findViewById(R.id.bRetry);
        share = (Button)findViewById(R.id.bShare);
        result = (TextView)findViewById(R.id.ResultView);
        ll = (LinearLayout)findViewById(R.id.ResultLayout);
        retry.setOnClickListener(this);
        share.setOnClickListener(this);
        loadScore();

    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.bRetry :
                setResult(RESULT_OK);
                finish();
                break;
            case R.id.bShare :
                Bitmap bitmap = getscreenshot(ll);
                saveBitmap(bitmap);
                shareIt();
                break;

        }
    }
    private Bitmap getscreenshot(View view) {
        View v = view;
        v.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(v.getDrawingCache());
        return bitmap;
    }
    private void saveBitmap(Bitmap bitmap) {
        imagePath = new File(Environment.getExternalStorageDirectory() + "/screenshot.png"); ////File imagePath
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(imagePath);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            Log.e("TL", e.getMessage(), e);
        } catch (IOException e) {
            Log.e("TL", e.getMessage(), e);
        }
    }
    private void shareIt() {
        Uri uri = Uri.fromFile(imagePath);
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("image/*");
        String shareBody = "My highest score with screen shot";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "My Quiz score");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
    private void loadScore()
    {
        if(score<5) {
            result.setText(score + "/10\nHard Luck!!");
        }
        else {
            result.setText(+score + "/10\nGreat!!");
            result.setTextColor(getResources().getColor(R.color.green));
        }
    }
    @Override
    public void onBackPressed(){

    }
}
