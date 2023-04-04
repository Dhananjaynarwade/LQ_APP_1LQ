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

public class Csharp_Easy_Quiz extends AppCompatActivity {
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
    private Question_Model_Csharp_Easy currentQuestion;

    //    step 1
    private List<Question_Model_Csharp_Easy> questionList_Csharp_Easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp_easy_quiz);

        tvQuestion = findViewById(R.id.ShowQuestion_Csharp_easy);
        tvScore = findViewById(R.id.Score_C_sharp_easy);
        tvQuestionNo = findViewById(R.id.QuestionNo_Csharp_easy);
        tvTimer =findViewById(R.id.Timer_Csharp_easy);



        radioGroup=findViewById(R.id.radioGroup_Csharp_easy);
        rb1=findViewById(R.id.rb1_Csharp_easy);
        rb2=findViewById(R.id.rb2_Csharp_easy);
        rb3=findViewById(R.id.rb3_Csharp_easy);
        rb4=findViewById(R.id.rb4_Csharp_easy);


        btnNext=findViewById(R.id.btnNext_Csharp_easy);

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