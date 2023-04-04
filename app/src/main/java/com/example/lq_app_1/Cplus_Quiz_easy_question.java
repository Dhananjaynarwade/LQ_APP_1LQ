package com.example.lq_app_1;

import static kotlin.concurrent.TimersKt.timer;

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

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Cplus_Quiz_easy_question extends AppCompatActivity {
    private TextView tvQuestion,tvScore,tvQuestionNo,tvTimer;
    private RadioGroup radioGroup;
    private RadioButton rb1,rb2,rb3,rb4;
    private Button btnNext;

    int totalQuestion;
    int qCounter = 0;
    int Score;
    ColorStateList dfRbColor;
    boolean aanswered;
    CountDownTimer countDownTimer;
//    private QuestionModels_Cplus currentQuestion;
//    private List<QuestionModels_Cplus> questionsList_easy_Cplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_quiz_easy_question);

//        questionsList_easy_Cplus = new ArrayList<>(questionsList_easy_Cplus);
//        tvScore=findViewById(R.id.Cplus_Score);
//        tvQuestion=findViewById(R.id.Question_Cplus);
//        tvQuestionNo=findViewById(R.id.Cplus_Question_easyNo);
//        tvTimer=findViewById(R.id.Cplus_timer);
//
//        radioGroup=findViewById(R.id.Rgroup);
//        rb1=findViewById(R.id.option_javaEasy_1);
//        rb2=findViewById(R.id.option_javaEasy_2);
//        rb3=findViewById(R.id.option_javaEasy_3);
//        rb4=findViewById(R.id.option_javaEasy_4);
//        btnNext=findViewById(R.id.java_easy_NextBtn);

        dfRbColor =rb1.getTextColors();
//        addQuestions();

//        totalQuestion=questionsList_easy_Cplus.size();
//        showNextQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aanswered ==false){
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked()){
                        checkAnswer();
                    }
                    else {
                        Toast.makeText(Cplus_Quiz_easy_question.this, "Please Select an Option", Toast.LENGTH_SHORT).show();
                    }


                }
                else{
//                    showNextQuestion();
                }
                
            }
        });
    }

    private void checkAnswer() {
        aanswered = true;
        RadioButton rbselected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo = radioGroup.indexOfChild(rbselected) + 1;
//        if (answerNo  == currentQuestion.getCorrectAnsno()){
            Score++;
            tvScore.setText(" Score " + Score);

        }
//        rb1.setTextColor(Color.RED);
//        rb2.setTextColor(Color.RED);
//        rb3.setTextColor(Color.RED);
//        rb4.setTextColor(Color.RED);
//        switch (currentQuestion.getCorrectAnsno()){
//            case 1:
//                rb1.setTextColor(Color.GREEN);
//                break;
//
//            case 2:
//                rb2.setTextColor(Color.GREEN);
//                break;
//
//            case 3:
//                rb3.setTextColor(Color.GREEN);
//                break;
//
//            case 4:
//                rb4.setTextColor(Color.GREEN);
//                break;
//        }
//        if (qCounter < totalQuestion){
//            btnNext.setText("Next");
//
//        }
//        else {
//            btnNext.setText("Finish");
////            Intent intent= new Intent(this,java_Script_Quiz_Leve.class);
////            startActivity(intent);
//
//        }
//
//
//    }
//
//    private void showNextQuestion() {
//        radioGroup.clearCheck();
//        rb1.setTextColor(dfRbColor);
//        rb2.setTextColor(dfRbColor);
//        rb3.setTextColor(dfRbColor);
//        rb4.setTextColor(dfRbColor);
//
//
//        if (qCounter < totalQuestion) {
//            timer();
//
//            currentQuestion = questionsList_easy_Cplus.get(qCounter);
//            tvQuestion.setText(currentQuestion.getQuestion());
//            rb1.setText(currentQuestion.getOpt1());
//            rb2.setText(currentQuestion.getOpt2());
//            rb3.setText(currentQuestion.getOpt3());
//            rb4.setText(currentQuestion.getOpt4());
//
//
//            qCounter++;
//            btnNext.setText("Submit");
//            tvQuestionNo.setText("Question: "+qCounter+ "/"+totalQuestion);
//            aanswered=false;
//        }else {
//            finish();
//        }
//
//    }
//
//    private void timer() {
//        countDownTimer=new CountDownTimer(20000,1000) {
//            @Override
//            public void onTick(long millisUnitFinished) {
//                tvTimer.setText(String.valueOf("0"));
//                qCounter++;
//
//            }
//
//            @Override
//            public void onFinish() {
//                showNextQuestion();
//
//            }
//        }.start();
//    }
//
//
//    private void addQuestions() {
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//        questionsList_easy_Cplus.add(new QuestionModels_Cplus("java Langauge is ","os","driver ","programing langauge","c",3));
//
//


//    }

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