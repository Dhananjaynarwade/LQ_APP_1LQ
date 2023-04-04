package com.example.lq_app_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.L;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
   EditText email ,Password;
   Button LoginBTn;
   TextView CreateANAccount;
   TextView Forget_Password;
   ProgressBar progressBar;
   private String email1 ,pass;
    boolean passwordVisible;
    boolean  passwordunvisiable;
   FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        auth = FirebaseAuth.getInstance();

        email=findViewById(R.id.Login_Email);
        Password=findViewById(R.id.Login_PassWord);
        LoginBTn=findViewById(R.id.User_Loginbtn);
        progressBar=findViewById(R.id.progBar_l);
        CreateANAccount=findViewById(R.id.Create_Acconnt_Register);
        Forget_Password=findViewById(R.id.forgetPassword);



        Password.setOnTouchListener((view, event) -> {
            final int Right = 2;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= Password.getRight() - Password.getCompoundDrawables()[Right].getBounds().width()) {
                    int selection = Password.getSelectionEnd();
                    if (passwordVisible) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                           Password.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.visible_hide, 0);
                           Password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordVisible = false;
                        }

                    } else {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                            Password.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.visibility_on_show, 0);
                            Password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passwordVisible = true;

                        }
                        Password.setSelection(selection);
                        return true;
                    }
                }
            }

            return false;
        });
//        auth=FirebaseAuth.getInstance();
        Forget_Password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,ForgetPassword.class));
                finish();
            }
        });

        LoginBTn.setOnClickListener((v )-> ValiedateUser() );


        CreateANAccount.setOnClickListener((v)->startActivity(new Intent(Login.this,Register.class)));



    }
    @Override
    protected void onStart() {
        super.onStart();
        if (auth.getCurrentUser() != null){
            startActivity(new Intent(this,Start_Window_Play_Start.class));
            finish();
        }
    }

    private void ValiedateUser() {
        email1 = email.getText().toString();
        pass  = Password.getText().toString();

        if (email1.isEmpty() || pass.isEmpty()){
            Toast.makeText(this, "Please fill all feildes", Toast.LENGTH_SHORT).show();
        }
        else{
            loginUser();
        }







}

    private void loginUser() {
        auth.signInWithEmailAndPassword(email1,pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Login.this, "Login Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Login.this,Start_Window_Play_Start.class));
                    finish();
                }else {
                    Toast.makeText(Login.this, "Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    private boolean validateData(String login_email, String login_passWord) {
        if (!Patterns.EMAIL_ADDRESS.matcher(login_email).matches()){
            email.setError("valied");
            return false;
        }
        if(login_email.isEmpty()){
            email.setError("Please Enter Ur Email");
            return false;
        }
        if(login_passWord.length()<6){
            Password.setError("Password length is invalied");
            return false;
        }
        if(login_passWord.isEmpty()){
            Password.setError("Password is empty");
        }
        return true;
    }
}


