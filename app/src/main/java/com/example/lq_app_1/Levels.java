package com.example.lq_app_1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Levels extends AppCompatActivity {
    Button java,cplus,c,javaScript,Csharp,Android,Mysql,Mongodb,Html,Css;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        java=findViewById(R.id.java_Btn);
        cplus=findViewById(R.id.Cplus_Btn);
        c=findViewById(R.id.clang_Btn);
        javaScript=findViewById(R.id.js_Btn);
        Csharp=findViewById(R.id.Csharp_Btn);
        Android=findViewById(R.id.Androiod_Btn);
        Mysql=findViewById(R.id.mysql_Btn);
        Mongodb=findViewById(R.id.Mongodb_Btn);
        Html=findViewById(R.id.html_Btn);
        Css=findViewById(R.id.Css_Btn);




        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,Java_Quiz_Leve.class);
                startActivity(intent1);
            }
        });
        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,C_Plus_Quiz_Leve.class);
                startActivity(intent1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,C_Langauge_Quiz_Leve.class);
                startActivity(intent1);
            }
        });
        javaScript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,java_Script_Quiz_Leve.class);
                startActivity(intent1);
            }
        });
        Csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,C_Sharp_Quiz_Level.class);
                startActivity(intent1);
            }
        });

        Android .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,Android_Quiz_Level.class);
                startActivity(intent1);
            }
        });
        Mysql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,My_Sql_Quiz_Leve.class);
                startActivity(intent1);
            }
        });

        Mongodb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,Mongo_DB_Quiz_Level.class);
                startActivity(intent1);
            }
        });
        Html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,Html_Quiz_Level.class);
                startActivity(intent1);
            }
        });

        Css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Levels.this,Css_Quiz_Level.class);
                startActivity(intent1);
            }
        });



    }
}