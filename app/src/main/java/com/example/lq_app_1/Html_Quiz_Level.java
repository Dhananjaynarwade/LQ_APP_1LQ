package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Html_Quiz_Level extends AppCompatActivity {
    Button Easy,Hard,Difficult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_quiz_level);
        Easy=findViewById(R.id.html_easy);
        Hard=findViewById(R.id.html_hard);
        Difficult=findViewById(R.id.html_difficult);


        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Html_Quiz_Level.this,Html_Easy_Quiz.class);
                startActivity(intent2);
            }
        });
        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Html_Quiz_Level.this,Html_Hard_Quiz.class);
                startActivity(intent2);
            }
        });
        Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Html_Quiz_Level.this,Html_Difficult_Quiz.class);
                startActivity(intent2);
            }
        });
    }
}