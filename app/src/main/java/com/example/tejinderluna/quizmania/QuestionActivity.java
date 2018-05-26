package com.example.tejinderluna.quizmania;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 * Created by Tejinder Luna on 12/25/2017.
 */

public class QuestionActivity extends Activity implements
        View.OnClickListener {
    TextView questionText;
    RadioButton optionA,optionB,optionC,optionD;
    Button bNext;
    String category=null;
    String text = null;
    String correct=null;
    BooksQuestion bookquestion;
    MovieQuestion moviequestion;
    SportsQuestion sportsquestion;
    MusicQuestion musicquestion;
    ScienceQuestion sciencequestion;
    HistoryQuestion historyquestion;
    public static int count= 0;
    public static int score=0;
    String name,email;
    RadioGroup rg;
    int Result;
    Stack<Integer> numbers = new Stack<Integer>();
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        Bundle b = getIntent().getExtras();
        rg = (RadioGroup)findViewById(R.id.rgOptions);
        category =(String)b.getCharSequence("category");
        questionText = (TextView) findViewById(R.id.questionText);
        optionA = (RadioButton) findViewById(R.id.optionA);
        optionB = (RadioButton) findViewById(R.id.optionB);
        optionC = (RadioButton) findViewById(R.id.optionC);
        optionD = (RadioButton) findViewById(R.id.optionD);
        bNext = (Button) findViewById(R.id.bNext);
        optionA.setOnClickListener(this);
        optionB.setOnClickListener(this);
        optionC.setOnClickListener(this);
        optionD.setOnClickListener(this);
        bNext.setOnClickListener(this);
        name =(String)b.getCharSequence("name");
        email = (String)b.getCharSequence("email");
        setRandomNumbers();
        selectQuestions(category);

    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id)
        {
            case R.id.optionA :
                text = optionA.getText().toString();
               // matchAnswer(text);
                break;
            case R.id.optionB :
                text = optionB.getText().toString();
                //matchAnswer(text);
                break;
            case R.id.optionC :
                text = optionC.getText().toString();
               // matchAnswer(text);
                break;
            case R.id.optionD :
                text = optionD.getText().toString();
               // matchAnswer(text);
                break;
            case R.id.bNext :
                if(optionA.isChecked()||optionB.isChecked()||optionC.isChecked()||optionD.isChecked()) {
                    matchAnswer(text);
                    if (count < 10) {
                       rg.clearCheck();
                       if(category.equals("book"))
                        loadQuestion(bookquestion);
                       else if(category.equals("movie"))
                           loadQuestion(moviequestion);
                       else if(category.equals("sports"))
                           loadQuestion(sportsquestion);
                       else if(category.equals("music"))
                           loadQuestion(musicquestion);
                       else if(category.equals("history"))
                           loadQuestion(historyquestion);
                       else if(category.equals("science"))
                           loadQuestion(sciencequestion);

                    }
                    else {
                        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                        //Create a bundle object
                        Bundle b = new Bundle();
                        count = 0;
                        //Inserts a String value into the mapping of this Bundle
                        //b.putString("category", category);
                        b.putInt("score", score);
                        b.putString("name",name);
                        b.putString("email",email);
                        intent.putExtras(b);
                        //startActivity(intent);
                        startActivityForResult(intent,1001);
                        score = 0;
                    }
                }
                else{
                    Toast.makeText(this, "please select an Option", Toast.LENGTH_SHORT).show();
                }
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

    public void matchAnswer(String text){
        if(text.equalsIgnoreCase(correct)){
            score++;

        }
    }
    public void selectQuestions(String category)
    {
        switch(category)
        {
            case "movie":
                moviequestion = new MovieQuestion();
                loadQuestion(moviequestion);
                break;
            case "sports":
                sportsquestion =new SportsQuestion();
                loadQuestion(sportsquestion);
                break;
            case "book":
                bookquestion = new BooksQuestion();
                loadQuestion(bookquestion);
                break;
            case "music":
                musicquestion =new MusicQuestion();
                loadQuestion(musicquestion);
                break;
            case "history":
                historyquestion =new HistoryQuestion();
                loadQuestion(historyquestion);
                break;
            case"science":
                sciencequestion =new ScienceQuestion();
                loadQuestion(sciencequestion);
                break;
        }
    }
    public void loadQuestion(BooksQuestion bookquestion)
    {
        int qnum = generateRandomNumber();
        questionText.setText(bookquestion.getBookQuestionData().get(qnum).getQuestion());
        optionA.setText(bookquestion.getBookQuestionData().get(qnum).getOptionA());
        optionB.setText(bookquestion.getBookQuestionData().get(qnum).getOptionB());
        optionC.setText(bookquestion.getBookQuestionData().get(qnum).getOptionC());
        optionD.setText(bookquestion.getBookQuestionData().get(qnum).getOptionD());
        correct = bookquestion.getBookQuestionData().get(qnum).getCorrect();
        count++;

    }
    public void loadQuestion(MovieQuestion moviequestion)
    {
        int qnum = generateRandomNumber();
        questionText.setText(moviequestion.getMovieQuestionsData().get(qnum).getQuestion());
        optionA.setText(moviequestion.getMovieQuestionsData().get(qnum).getOptionA());
        optionB.setText(moviequestion.getMovieQuestionsData().get(qnum).getOptionB());
        optionC.setText(moviequestion.getMovieQuestionsData().get(qnum).getOptionC());
        optionD.setText(moviequestion.getMovieQuestionsData().get(qnum).getOptionD());
        correct = moviequestion.getMovieQuestionsData().get(qnum).getCorrect();
        count++;

    }
    public void loadQuestion(HistoryQuestion historyquestion)
    {
        int qnum = generateRandomNumber();
        questionText.setText(historyquestion.getHistoryQuestionData().get(qnum).getQuestion());
        optionA.setText(historyquestion.getHistoryQuestionData().get(qnum).getOptionA());
        optionB.setText(historyquestion.getHistoryQuestionData().get(qnum).getOptionB());
        optionC.setText(historyquestion.getHistoryQuestionData().get(qnum).getOptionC());
        optionD.setText(historyquestion.getHistoryQuestionData().get(qnum).getOptionD());
        correct = historyquestion.getHistoryQuestionData().get(qnum).getCorrect();
        count++;

    }
    public void loadQuestion(MusicQuestion musicquestion)
    {
        int qnum = generateRandomNumber();
        questionText.setText(musicquestion.getMusicQuestionData().get(qnum).getQuestion());
        optionA.setText(musicquestion.getMusicQuestionData().get(qnum).getOptionA());
        optionB.setText(musicquestion.getMusicQuestionData().get(qnum).getOptionB());
        optionC.setText(musicquestion.getMusicQuestionData().get(qnum).getOptionC());
        optionD.setText(musicquestion.getMusicQuestionData().get(qnum).getOptionD());
        correct = musicquestion.getMusicQuestionData().get(qnum).getCorrect();
        count++;
    }
    public void loadQuestion(ScienceQuestion sciencequestion)
    {
        int qnum = generateRandomNumber();
        questionText.setText(sciencequestion.getScienceQuestionData().get(qnum).getQuestion());
        optionA.setText(sciencequestion.getScienceQuestionData().get(qnum).getOptionA());
        optionB.setText(sciencequestion.getScienceQuestionData().get(qnum).getOptionB());
        optionC.setText(sciencequestion.getScienceQuestionData().get(qnum).getOptionC());
        optionD.setText(sciencequestion.getScienceQuestionData().get(qnum).getOptionD());
        correct = sciencequestion.getScienceQuestionData().get(qnum).getCorrect();
        count++;
    }
    public void loadQuestion(SportsQuestion sportsquestion)
    {
        int qnum = generateRandomNumber();
        questionText.setText(sportsquestion.getSportsQuestionData().get(qnum).getQuestion());
        optionA.setText(sportsquestion.getSportsQuestionData().get(qnum).getOptionA());
        optionB.setText(sportsquestion.getSportsQuestionData().get(qnum).getOptionB());
        optionC.setText(sportsquestion.getSportsQuestionData().get(qnum).getOptionC());
        optionD.setText(sportsquestion.getSportsQuestionData().get(qnum).getOptionD());
        correct = sportsquestion.getSportsQuestionData().get(qnum).getCorrect();
        count++;
    }


   public int generateRandomNumber(){
       return numbers.pop();
    }
    public void setRandomNumbers()
    {
        Random r = new Random();
        int Low = 0;
        int High = 20;
        for(int i=1;i<=40;i++) {
             Result = r.nextInt(High - Low) + Low;
            if (!numbers.contains(Result)) {
                numbers.push(Result);
            }
        }
    }
    @Override
    public void onBackPressed(){

    }

}
