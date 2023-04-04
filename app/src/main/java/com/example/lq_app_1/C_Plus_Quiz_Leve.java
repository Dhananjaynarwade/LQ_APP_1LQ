package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_Plus_Quiz_Leve extends AppCompatActivity {

    Button Easy,Hard ,Difficult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_quiz_leve);

        Easy=findViewById(R.id.Cplus_easy);
        Hard=findViewById(R.id.Cplus_hard);
        Difficult=findViewById(R.id.Cplus_difficult);


        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(C_Plus_Quiz_Leve.this,Cplus_Quiz_easy_question.class);
                startActivity(intent1);

            }
        });

        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(C_Plus_Quiz_Leve.this,Cplus_Quiz_hard_question.class);
                startActivity(intent2);


            }
        });

Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(C_Plus_Quiz_Leve.this,Cplus_Quiz_difficult_question.class);
                startActivity(intent3);


            }
        });
    }
}