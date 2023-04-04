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

public class Html_Difficult_Quiz extends AppCompatActivity {
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
    private Question_Model_Html_Difficult currentQuestion;

    //    step 1
    private List<Question_Model_Html_Difficult> questionList_Html_Diffcult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_difficult_quiz);

        tvQuestion = findViewById(R.id.ShowQuestion_Difficult_html);
        tvScore = findViewById(R.id.Score_Difficult_Html);
        tvQuestionNo = findViewById(R.id.QuestionNo_Diidicult_Html);
        tvTimer =findViewById(R.id.Timer_Difficult_Html);



        radioGroup=findViewById(R.id.radioGroup_Difficult_Html);
        rb1=findViewById(R.id.rb1_Difficult_html);
        rb2=findViewById(R.id.rb2_difficult_html);
        rb3=findViewById(R.id.rb3_difficult_html);
        rb4=findViewById(R.id.rb4_difficult_html);


        btnNext=findViewById(R.id.btnNext_difficult_html);

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