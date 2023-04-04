package com.example.lq_app_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Java_Easy_Question extends AppCompatActivity {
//    private RadioGroup radioGroup;
//    private RadioButton rb1;
//    private RadioButton rb2;
//    private RadioButton rb3;
//    private RadioButton rb4;
//    private  Button NextbtnQuestion;
//
//    private TextView textViewQuestion;
//    private TextView textViewScore;
//    private TextView textViewWrong;
//    private TextView textViewCorrect;
//    private TextView textViewTimer;
//
//    private int questionCounter;
//    private int questionTotalCount;
//    private Java_Easy_Question currentQuestion;
//    private boolean answerd;
//    Button Share,Next;
//String list,position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_easy_question);

//
//
//        textViewCorrect=findViewById(R.id.Score_correct);
//        textViewWrong=findViewById(R.id.Score_wrong);
//        textViewScore=findViewById(R.id.Score_easy);
//        textViewQuestion=findViewById(R.id.Score_timer);
//
//
//        NextbtnQuestion=findViewById(R.id.java_easy_NextBtn);
//        rb1=findViewById(R.id.option_javaEasy_1);
//        rb1=findViewById(R.id.option_javaEasy_2);
//        rb3=findViewById(R.id.option_javaEasy_3);
//        rb4=findViewById(R.id.option_javaEasy_4);
//
//        Share=findViewById(R.id.java_easy_ShareBtn);






//        Share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                String body=list.get(position).getQuestions()+
////                        list.get(position).getOptionA()+
//
//                Intent shareIn= new Intent(Intent.ACTION_SEND);
//                shareIn.setType("text/plain");
//                shareIn.putExtra(Intent.EXTRA_SUBJECT,"question");
//                startActivity(Intent.createChooser(shareIn,"Share via"));
//
//            }
//        });
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