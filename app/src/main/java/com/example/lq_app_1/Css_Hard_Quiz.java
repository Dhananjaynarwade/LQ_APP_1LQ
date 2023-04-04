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

public class Css_Hard_Quiz extends AppCompatActivity {
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
    private Question_Model_Css_Hard currentQuestion;

    //    step 1
    private List<Question_Model_Css_Hard> questionList_Css_Difficult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_hard_quiz);


        tvQuestion = findViewById(R.id.QuestionText_Css_hard);
        tvScore = findViewById(R.id.Score_Css_hard);
        tvQuestionNo = findViewById(R.id.Question_Css_hard);
        tvTimer =findViewById(R.id.Timer_Csse_hard);



        radioGroup=findViewById(R.id.radioGroup_hard_Css);
        rb1=findViewById(R.id.rb1_hard_Css);
        rb2=findViewById(R.id.rb2_hard_Css);
        rb3=findViewById(R.id.rb3_hard_Css);
        rb4=findViewById(R.id.rb4_hard_Css);


        btnNext=findViewById(R.id.btnNext_hard_Css);

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