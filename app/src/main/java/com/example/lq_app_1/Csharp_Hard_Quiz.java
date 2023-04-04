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

public class Csharp_Hard_Quiz extends AppCompatActivity {
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
    private Question_Model_Csharp_Hard currentQuestion;

    //    step 1
    private List<Question_Model_Csharp_Hard> questionList_Csharp_Hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp_hard_quiz);


        tvQuestion = findViewById(R.id.ShowQuestion_Csharp_Hard);
        tvScore = findViewById(R.id.Score_Csharp_hard);
        tvQuestionNo = findViewById(R.id.QuestionNo_Csharp_hard);
        tvTimer =findViewById(R.id.Timer_Csharp_Hard);



        radioGroup=findViewById(R.id.radioGroup_Csharp_Hard);
        rb1=findViewById(R.id.rb1_Csharp_Hard);
        rb2=findViewById(R.id.rb2_Csharp_Hard);
        rb3=findViewById(R.id.rb3_Csharp_Hard);
        rb4=findViewById(R.id.rb4_Csharp_Hard);


        btnNext=findViewById(R.id.btnNext_Csharp_hard);

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