package com.example.tejinderluna.quizmania;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Tejinder Luna on 12/9/2017.
 */

public class Quiz_Categories_Activity extends Activity implements
        View.OnClickListener {
    private ImageButton btn_Movie,btn_Music,btn_Book,btn_Sports,btn_History,btn_Science;
    String category=null;
    String name,email;
    @Override
    public void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_categories);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        btn_Movie = (ImageButton) findViewById(R.id.bMovie);
        btn_Music = (ImageButton) findViewById(R.id.bMusic);
        btn_Book = (ImageButton) findViewById(R.id.bBook);
        btn_Sports = (ImageButton) findViewById(R.id.bSports);
        btn_History = (ImageButton) findViewById(R.id.bHistory);
        btn_Science = (ImageButton) findViewById(R.id.bScience);
        //set listeners
        btn_Movie.setOnClickListener(this);
        btn_Music.setOnClickListener(this);
        btn_Book.setOnClickListener(this);
        btn_Sports.setOnClickListener(this);
        btn_History.setOnClickListener(this);
        btn_Science.setOnClickListener(this);
        Bundle b = getIntent().getExtras();
        name =(String)b.getCharSequence("name");
        email = (String)b.getCharSequence("email");
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.quizmenu, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch(id){
            case R.id.bMovie :
                category = btn_Movie.getContentDescription().toString();
                //Toast.makeText(this, "data"+category, Toast.LENGTH_SHORT).show();
                startIntent(category);
                break;
            case R.id.bMusic :
                category = btn_Music.getContentDescription().toString();
                //Toast.makeText(this, "data"+category, Toast.LENGTH_SHORT).show();
                startIntent(category);
                break;
            case R.id.bBook :
                category = btn_Book.getContentDescription().toString();
                //Toast.makeText(this, "data"+category, Toast.LENGTH_SHORT).show();
                startIntent(category);
                break;
            case R.id.bSports :
                category = btn_Sports.getContentDescription().toString();
                //Toast.makeText(this, "data"+category, Toast.LENGTH_SHORT).show();
                startIntent(category);
                break;
            case R.id.bHistory:
                category = btn_History.getContentDescription().toString();
                //Toast.makeText(this, "data"+category, Toast.LENGTH_SHORT).show();
                startIntent(category);
                break;
            case R.id.bScience :
                category = btn_Science.getContentDescription().toString();
               // Toast.makeText(this, "data"+category, Toast.LENGTH_SHORT).show();
                startIntent(category);
                break;
        }

    }

    private void startIntent(String category) {
        Intent intent = new Intent(getApplicationContext(), InstructionActivity.class);
        //Create a bundle object
        Bundle b = new Bundle();

        //Inserts a String value into the mapping of this Bundle
        b.putString("category", category);
        b.putString("name",name);
        b.putString("email",email);
        intent.putExtras(b);
        //startActivity(intent);
        startActivity(intent);
    }
}
