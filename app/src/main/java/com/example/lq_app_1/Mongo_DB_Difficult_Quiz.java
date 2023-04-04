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

public class Mongo_DB_Difficult_Quiz extends AppCompatActivity {
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
    private Question_Model_mongodb_Difficult currentQuestion;

    //    step 1
    private List<Question_Model_mongodb_Difficult> questionList_Mongodb_Difficult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mongo_db_difficult_quiz);

        tvQuestion=findViewById(R.id.QuestionText_Mongodb_difficult);
        tvScore = findViewById(R.id.Score_Mongodb_Difficult);
        tvQuestionNo = findViewById(R.id.QuestioNo_Mongodb_Difficult);
        tvTimer =findViewById(R.id.Timer_Mongodb_Difficult);



        radioGroup=findViewById(R.id.radioGroup_Mongodb_Difficult);
        rb1=findViewById(R.id.rb1_Mongodb_Dfficult);
        rb2=findViewById(R.id.rb2_Mongodb_Difficult);
        rb3=findViewById(R.id.rb3_Mongodb_Difficult);
        rb4=findViewById(R.id.rb4_Mongodb_Difficult);


        btnNext=findViewById(R.id.btnNext_Mongodb_Difficult);

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