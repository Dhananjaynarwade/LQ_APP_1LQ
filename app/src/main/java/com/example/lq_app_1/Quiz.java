package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quiz extends AppCompatActivity {
    Button Play,Topic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



//        Button java,cplus,c,javaScript,Csharp,Android,Mysql,Mongodb,Html,Css;
        Play=findViewById(R.id.play_for);

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Quiz.this,Levels.class);
                startActivity(intent);
            }
        });


        Topic=findViewById(R.id.topic_for);
        Topic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(Quiz.this,Open.class);
                startActivity(intent1);
            }
        });

    }
}