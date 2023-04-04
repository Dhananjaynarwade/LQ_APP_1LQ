package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Java_Quiz_Leve extends AppCompatActivity {
    Button Easybtn,HardBtn,DifficultBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_quiz_leve);
        Easybtn=findViewById(R.id.java_easy);
        HardBtn=findViewById(R.id.java_hard);
        DifficultBtn=findViewById(R.id.java_difficult);


        Easybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_easy= new Intent(Java_Quiz_Leve.this,Java_Easy_Question.class);
                startActivity(intent_easy);
            }
        });

        HardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent raa= new Intent(Java_Quiz_Leve.this,Java_Hard_Question.class);
                startActivity(raa);
            }
        });

        DifficultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Java_Quiz_Leve.this,Java_Difficult_Question.class);
                startActivity(i);
            }
        });

    }
}