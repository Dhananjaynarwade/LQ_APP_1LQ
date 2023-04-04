package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mongo_DB_Quiz_Level extends AppCompatActivity {
    Button Easy,Hard,Difficult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mongo_db_quiz_level);
        Easy=findViewById(R.id.mongodb_easy);
        Hard=findViewById(R.id.mongodb_hard);
        Difficult=findViewById(R.id.mongodb_difficult);



        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Mongo_DB_Quiz_Level.this,Mongo_DB_Easy_Quiz.class);
                startActivity(intent2);
            }
        });
        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Mongo_DB_Quiz_Level.this,Mongo_DB_Hard_Quiz.class);
                startActivity(intent2);
            }
        });

        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(Mongo_DB_Quiz_Level.this,Mongo_DB_Difficult_Quiz.class);
                startActivity(intent2);
            }
        });
    }
}