package com.example.tejinderluna.quizmania;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Tejinder Luna on 12/16/2017.
 */

public class InstructionActivity extends Activity implements
        View.OnClickListener{
    private Button btn_Start_Quiz;
    private TextView instructionview;
    String category=null;
    String name,email;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        //itemSignOut=(MenuItem)findViewById(R.id.logout);
        // activity =new MainActivity();
        Bundle b = getIntent().getExtras();
        instructionview =(TextView)findViewById(R.id.instructionView);
        btn_Start_Quiz =(Button) findViewById(R.id.bStartQuiz);
        category =(String)b.getCharSequence("category");
        name = (String)b.getCharSequence("name");
        email =(String)b.getCharSequence("email");
        setInstructionView(category);
        btn_Start_Quiz.setOnClickListener(this);

    }

    private void setInstructionView(String category) {
        instructionview.setText("U will be asked 10 questions Based upon "+category+" Click START to Continue");
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.bStartQuiz :
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                //Create a bundle object
                Bundle b = new Bundle();
                b.putString("category", category);
                b.putString("name",name);
                b.putString("email",email);
                intent.putExtras(b);
                startActivityForResult(intent,1001);
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1001)
        {
            setResult(RESULT_OK);
            finish();
        }
    }
}
