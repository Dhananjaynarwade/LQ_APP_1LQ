package com.example.lq_app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class My_Sql_Quiz_Leve extends AppCompatActivity {
    Button  Easy,Hard,Difficult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sql_quiz_leve);

        Easy=findViewById(R.id.mysql_easy);
        Hard=findViewById(R.id.mysql_hard);
        Difficult=findViewById(R.id.mysql_difficult);



        //the lauout is this is on  ---> MY_Sql_Easy_Quiz1


        Easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(My_Sql_Quiz_Leve.this,MY_Sql_Easy_Quiz1.class);
                startActivity(intent);
            }
        });




        Hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(My_Sql_Quiz_Leve.this,My_Sql_Hard_Quiz.class);
                startActivity(intent2);
            }
        });


        Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(My_Sql_Quiz_Leve.this,MySql_Difficult_Quiz.class);
                startActivity(intent2);
            }
        });
    }
}