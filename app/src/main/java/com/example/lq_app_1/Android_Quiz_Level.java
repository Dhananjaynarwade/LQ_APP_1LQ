package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Android_Quiz_Level extends AppCompatActivity {
    Button  Easyandroid,Hardandroid,Difficultandroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_quiz_level);

        Easyandroid=findViewById(R.id.android_easy);
        Hardandroid=findViewById(R.id.android_hard);
        Difficultandroid=findViewById(R.id.android_difficult);



        Easyandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Android_Quiz_Level.this,Android_Easy_Quiz.class);
                startActivity(intent2);



            }
        });
        Hardandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Android_Quiz_Level.this,Android_Hard_Quiz.class);
                startActivity(intent2);

            }
        });
        Difficultandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2= new Intent(Android_Quiz_Level.this,Android_Difficult_Quiz.class);
                startActivity(intent2);
            }
        });
    }
}