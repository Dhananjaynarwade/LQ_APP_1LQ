package com.example.lq_app_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPassword extends AppCompatActivity {
    private EditText forEmail;
    private Button forgotBtn;
    private  String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        forEmail = findViewById(R.id.Login_Email_forget_Email);
        forgotBtn=findViewById(R.id.User_Loginbtn_forgot_Password);

        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = forEmail.getText().toString();

                if (email.isEmpty()){
                    Toast.makeText(ForgetPassword.this, "Please provide your email", Toast.LENGTH_SHORT).show();
                }
                else {
                    forgotPassword();
                }
            }
        });
    }

    private void forgotPassword() {
        FirebaseAuth auth = FirebaseAuth.getInstance();


        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()){
                    Toast.makeText(ForgetPassword.this, "Check Your Email", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(ForgetPassword.this,Login.class));
                    finish();
                }
                else {
                    Toast.makeText(ForgetPassword.this, "Error :"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}