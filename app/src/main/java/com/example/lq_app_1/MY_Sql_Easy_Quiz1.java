package com.example.lq_app_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class MY_Sql_Easy_Quiz1 extends AppCompatActivity {
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
    private Question_Model_Mysql_Easy currentQuestion;

    //    step 1
    private List<Question_Model_Mysql_Easy> questionList_Mysql_Easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sql_easy_quiz1);

        tvQuestion = findViewById(R.id.QuestionText_Easy_MYsql);
        tvScore = findViewById(R.id.Score_Easy_MYsql);
        tvQuestionNo = findViewById(R.id.QuestionNo_Easy_MYsql);
        tvTimer =findViewById(R.id.Timer_Easy_MYsql);



        radioGroup=findViewById(R.id.radioGroup_Easy_MYsql);
        rb1=findViewById(R.id.rb1_Easy_MYsql);
        rb2=findViewById(R.id.rb2_hard_Easy_MYsql);
        rb3=findViewById(R.id.rb3_Easy_MYsql);
        rb4=findViewById(R.id.rb4_Easy_MYsql);


        btnNext=findViewById(R.id.btnNext_Easy_MYsql);

        dfRbColor = rb1.getTextColors();
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