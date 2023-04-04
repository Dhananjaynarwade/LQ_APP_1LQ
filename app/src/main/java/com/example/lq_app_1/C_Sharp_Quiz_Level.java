package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_Sharp_Quiz_Level extends AppCompatActivity {

    Button  CsharpEasy,CsharpHard,CsharpDifficult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp_quiz_level);
        CsharpEasy=findViewById(R.id.C_sharpe_easy);
        CsharpHard=findViewById(R.id.C_sharp_hard);
        CsharpDifficult=findViewById(R.id.C_shar_difficult);

//
        CsharpEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(C_Sharp_Quiz_Level.this,Csharp_Easy_Quiz.class);
                startActivity(intent2);


            }
        });

        CsharpHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(C_Sharp_Quiz_Level.this,Csharp_Hard_Quiz.class);
                startActivity(intent2);

            }
        });


        CsharpDifficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(C_Sharp_Quiz_Level.this,Csharp_Difficult_Quiz.class);
                startActivity(intent2);

            }
        });
    }
}