package com.example.lq_app_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class Cplus_Quiz_hard_question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_quiz_hard_question);
    }
    @Override
    public void onBackPressed( ) {
        new AlertDialog.Builder(this).setMessage("Are You  Sure  u Want Quiz The Quiz ").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No",null).show();

    }
}