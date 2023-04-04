package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Window_Play_Start extends AppCompatActivity {
    Button playb,Aboutb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_window_play_start);

        playb=findViewById(R.id.play);

        playb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Start_Window_Play_Start.this,Quiz.class);
                startActivity(intent);
            }
        });
        Aboutb=findViewById(R.id.about);

        Aboutb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Start_Window_Play_Start.this,About.class);
                startActivity(intent1);
            }
        });

    }
}