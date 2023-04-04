package com.example.lq_app_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Js_Easy_Quiz extends AppCompatActivity {
    private TextView tvQuestion, tvScore,tvQuestionNo,tvTimer;
    private RadioGroup radioGroup;
    private RadioButton rb1,rb2,rb3,rb4;
    private Button btnNext;
    int totalQuestion;
    int qCounter =0;
    int score;
    ColorStateList dfRbColor;
    boolean answered;
    CountDownTimer countDownTimer;
    private   Question_Model_js_Easy currentQuestion;

    private List<Question_Model_js_Easy> questionList_js_Easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_js_easy_quiz);

        questionList_js_Easy=new ArrayList<>();
        tvQuestion=findViewById(R.id.QuestionText_Js_Easy);
        tvScore=findViewById(R.id.Score_js_Easy);
        tvQuestionNo=findViewById(R.id.QuestionNo_Js_Easy);
        tvTimer=findViewById(R.id.Timer_js_Easy);

        radioGroup=findViewById(R.id.radioGroup_Js_Easy);
        rb1=findViewById(R.id.rb1_Js_Easy);
        rb2=findViewById(R.id.rb2_Js_Easy);
        rb3=findViewById(R.id.rb3_Js_Easy);
        rb4=findViewById(R.id.rb4_Js_Easy);

        btnNext=findViewById(R.id.btnNext_Js_Easy);

        dfRbColor =rb1.getTextColors();




        
        addQuestion();
        totalQuestion = questionList_js_Easy.size();
        showNextQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answered ==false){
                    if (rb1.isChecked()|| rb2.isChecked() || rb3.isChecked() || rb4.isChecked()){

                        checkAnswer();
                        countDownTimer.cancel();


                    }
                    else {
                        Toast.makeText(Js_Easy_Quiz.this, "Please Select an Option", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    showNextQuestion();
                }
            }
        });
        
    }

    private void checkAnswer() {
        answered =true;
        RadioButton rbSelected =findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo =radioGroup.indexOfChild(rbSelected) +1;
        if (answerNo == currentQuestion.getCorrectAnsNo_js_Easy()){
            score++;
            tvScore.setText("Score: "+score);

        }
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);
        switch (currentQuestion.getCorrectAnsNo_js_Easy()){
            case 1:
                rb1.setTextColor(Color.GREEN);
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                break;

            case 3:
                rb3.setTextColor(Color.GREEN);
                break;

            case 4:
                rb4.setTextColor(Color.GREEN);
                break;

        }
        if (qCounter <totalQuestion) {

            btnNext.setText("Next");

        }
        else {
            btnNext.setText("Finish");
            //here we pass result activity
        }

    }



    private void showNextQuestion() {
        radioGroup.clearCheck();
        rb1.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);
        rb4.setTextColor(dfRbColor);


        if (qCounter <  totalQuestion){
            timer();
            currentQuestion= questionList_js_Easy.get(qCounter);
            tvQuestion.setText(currentQuestion.getQuestionC());
            rb1.setText(currentQuestion.getOptc1());
            rb2.setText(currentQuestion.getOptc2());
            rb3.setText(currentQuestion.getOptc3());
            rb4.setText(currentQuestion.getOptc4());

            qCounter++;
            btnNext.setText("Submit");
            tvQuestionNo.setText("Question: "+qCounter+"/"+totalQuestion);
            answered =false;


        }else {
            finish();
        }
    }

    private void timer() {

        countDownTimer = new CountDownTimer(20000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("00:"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                showNextQuestion();

            }
        }.start();
    }

    private void addQuestion() {
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
        questionList_js_Easy.add(new Question_Model_js_Easy("The script tag must be placed in","A. head","B. head and body","C. title and head","D. all of the mentioned",2));
    }

    @Override
    public void onBackPressed( ) {
        new AlertDialog.Builder(this).setMessage("Are You  Sure  u Want Quiz The Quiz ").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No",null).show();

    }
}