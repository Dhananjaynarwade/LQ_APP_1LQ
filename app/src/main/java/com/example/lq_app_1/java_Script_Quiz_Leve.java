package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class java_Script_Quiz_Leve extends AppCompatActivity {
    Button JsEasy,JsHard,JsDifficult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_script_quiz_leve);

        JsEasy=findViewById(R.id.js_easy);
        JsHard=findViewById(R.id.js_hard);
        JsDifficult=findViewById(R.id.js_difficult);

        JsEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(java_Script_Quiz_Leve.this,Js_Easy_Quiz.class);
                startActivity(intent1);
            }
        });

        JsHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(java_Script_Quiz_Leve.this,Js_Hard_Quiz.class);
                startActivity(intent1);

            }
        });
        JsDifficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(java_Script_Quiz_Leve.this,Js_Difficult_quiz.class);
                startActivity(intent1);

            }
        });
    }
}