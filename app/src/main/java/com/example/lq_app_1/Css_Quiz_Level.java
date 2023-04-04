package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Css_Quiz_Level extends AppCompatActivity {

    Button   Easycss,Hardcss,Difficultcss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_quiz_level);

        Easycss=findViewById(R.id.easy_css);
        Hardcss=findViewById(R.id.hard_css);
        Difficultcss=findViewById(R.id.difficult_css);



        Easycss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Css_Quiz_Level.this,Css_Easy_Quiz.class);
                startActivity(intent);


            }
        });

        Hardcss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Css_Quiz_Level.this,Css_Hard_Quiz.class);
                startActivity(intent);

            }
        });

        Difficultcss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Css_Quiz_Level.this,Css_Difficult_Quiz.class);
                startActivity(intent);

            }
        });





    }
}