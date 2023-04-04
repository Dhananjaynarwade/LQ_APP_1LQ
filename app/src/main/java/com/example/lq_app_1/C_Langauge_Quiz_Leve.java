package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class C_Langauge_Quiz_Leve extends AppCompatActivity {

    TextView  Easy,hard,Difficult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clangauge_quiz_leve);
//C_langauge_hard

        Easy=findViewById(R.id.C_langauge_easy);
       hard =findViewById(R.id.C_langauge_hard);
        Difficult=findViewById(R.id.C_langauge_difficult);


        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(C_Langauge_Quiz_Leve.this,C_langauge_Easy_level_quiz.class);
                startActivity(intent1);
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intente= new Intent(C_Langauge_Quiz_Leve.this,C_langauge_Hard_level_quiz.class);
                startActivity(intente);
            }
        });
        Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(C_Langauge_Quiz_Leve.this,C_langauge_Difficult_level_quiz.class);
                startActivity(intent1);

            }
        });






    }
}