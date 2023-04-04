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

public class Android_Hard_Quiz extends AppCompatActivity {
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
    private Question_Model_Android_Hard currentQuestion;

    //    step 1
    private List<Question_Model_Android_Hard> questionList_Android_Hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_hard_quiz);

        tvQuestion = findViewById(R.id.QuestionShow_Android_Hard);
        tvScore = findViewById(R.id.Score_Android_Hard);
        tvQuestionNo = findViewById(R.id.QuestionNo_Android_Hard);
        tvTimer =findViewById(R.id.Timer_Android_Hard);



        radioGroup=findViewById(R.id.radioGroup_Android_Hard);
        rb1=findViewById(R.id.rb1_Android_Hard);
        rb2=findViewById(R.id.rb2_Android_Hard);
        rb3=findViewById(R.id.rb3_Android_Hard);
        rb4=findViewById(R.id.rb4_Android_Hard);


        btnNext=findViewById(R.id.btnNext_Android_Hard);

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