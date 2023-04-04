package com.example.lq_app_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.UserHandle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Register extends AppCompatActivity {
//    public static final String TAG = "TAG";



    EditText regName,regEamil,regPassword,regRetypePassord;

    Button SignUpAccount_Btn;
    TextView loginBtn_TextView;
    ProgressBar progressBar;
    boolean passwordVisible;
    boolean  passwordunvisiable;


    String name,email,password,repass;

    private   FirebaseAuth firebaseAuth =FirebaseAuth.getInstance();
    private DatabaseReference reference;
    private DatabaseReference dbRef;





    String userID;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firebaseAuth = FirebaseAuth.getInstance();
        reference= FirebaseDatabase.getInstance().getReference();


        regName = findViewById(R.id.EditText_username);
        regEamil = findViewById(R.id.EditText_email);

        regPassword = findViewById(R.id.password_id);
        regRetypePassord = findViewById(R.id.Edittext_repassword);

        SignUpAccount_Btn = findViewById(R.id.Button_Signup_Account);
        loginBtn_TextView = findViewById(R.id.TextView_LoginPage);
        progressBar = findViewById(R.id.progBar);
        firebaseAuth = FirebaseAuth.getInstance();


//        password hide nd show

        regPassword.setOnTouchListener((view, event) -> {
            final int Right = 2;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= regPassword.getRight() -regPassword.getCompoundDrawables()[Right].getBounds().width()) {
                    int selection = regPassword.getSelectionEnd();
                    if (passwordVisible) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                            regPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.visible_hide, 0);
                            regPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordVisible = false;
                        }

                    } else {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                            regPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.visibility_on_show, 0);
                            regPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passwordVisible = true;

                        }
                        regPassword.setSelection(selection);
                        return true;
                    }
                }
            }

            return false;
        });

        regRetypePassord.setOnTouchListener((view, event) -> {
            final int Right = 2;
            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getRawX() >= regRetypePassord.getRight() - regRetypePassord.getCompoundDrawables()[Right].getBounds().width()) {
                    int selection = regRetypePassord.getSelectionEnd();
                    if (passwordunvisiable) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                            regRetypePassord.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.visible_hide, 0);
                            regRetypePassord.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordunvisiable = false;
                        }


                    } else {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                            regRetypePassord.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.visibility_on_show, 0);
                            regRetypePassord.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passwordunvisiable = true;

                        }
                        regRetypePassord.setSelection(selection);
                        return true;


                    }
                }
            }

            return false;
        });



        loginBtn_TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));
            }
        });
        SignUpAccount_Btn.setOnClickListener(v -> {
          validatateUser();

        });

//        SignUpAccount_Btn.setOnClickListener(v -> {
//            String txtemail=Eamil.getText().toString();
//            String  txtusername      =UserName.getText().toString();
//            String   txtpassword     =PassWord.getText().toString();
//            String   txtretypepassord     = RetypePassord.getText().toString();
//
//
//                if (TextUtils.isEmpty(txtusername )) {
//                    UserName.setError("Enter Your Nmae");
//
//                }
//                if(!Patterns.EMAIL_ADDRESS.matcher(txtemail).matches()){
//                    Eamil.setError("Valied");
//                    Toast.makeText(this, "Please Enter a Valied Email", Toast.LENGTH_SHORT).show();
//
//
//                }
//                if( txtpassword.length()<6){
//                    PassWord.setError("Password Length is invalid");
//                    Toast.makeText(this, "Password become more than 6 characters ", Toast.LENGTH_SHORT).show();
//
//
//                }
//                if( txtretypepassord .equals(RetypePassord)){
//                    RetypePassord.setError("Password is not match");
//                }
//                if( txtpassword.isEmpty()){
//                    PassWord.setError("Password is Empty");
//                }
//                if( txtretypepassord.isEmpty()){
//                    RetypePassord.setError("Confirm  is Empty");
//                    Toast.makeText(this, "Confirm Password is empty", Toast.LENGTH_SHORT).show();
//                }
//                else {
//                    registerUser(txtemail,txtpassword);
//                }
//
//
//
//
//
//            });
//
//
//
//
//
//
//
//    }
//
//    private void registerUser(String txtemail, String txtpassword) {
//        firebaseAuth.createUserWithEmailAndPassword(Eamil,PassWord).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(Register.this, "Register is successful", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(Register.this,Login.class));
//                }
//                else {
//                    Toast.makeText(Register.this, "failed Register"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (firebaseAuth.getCurrentUser() != null){
            startActivity(new Intent(this,MainActivity.class));
            finish();
        }
    }

    private void validatateUser() {
        
        name= regName.getText().toString();
        email= regEamil.getText().toString();
        password= regPassword.getText().toString();
        repass= regRetypePassord.getText().toString();
        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || repass.isEmpty()) {
            Toast.makeText(this, "PPlease fill all fields", Toast.LENGTH_SHORT).show();
            
        }
        else {
            registerUser();
        }
    }

    private void registerUser() {
        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Register.this, "User Created", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Register.this,MainActivity.class));
                    finish();
                }
                else {
                    Toast.makeText(Register.this, "Error" +task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }


            }
        });


    }


//    @Override
//    protected void onStart() {
//
//        super.onStart();
//        if (firebaseAuth.getCurrentUser() != null){
//            openMain();
//        }
//    }
//
//    private void openMain() {
//        startActivity(new Intent(this,MainActivity.class));
//    }

    private void validateData() {
        name=  regName.getText().toString();
        email=regEamil.getText().toString();
        password=regPassword.getText().toString();
        repass=regRetypePassord.getText().toString();

        if (name.isEmpty()){
            regName.setError("Required");
            regName.requestFocus();
        } else if (email.isEmpty()) {
            regEamil.setError("Required");
        } else if (password.length() < 6) {
            regPassword.setError("Password must be gretter than 6 haracters");


        } else if (repass.isEmpty()) {
            regRetypePassord.setError("re password is empty");

        }



    }
//
//    private void createUser() {
//        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()){
//                    uploaData();
//
//                }
//                else {
//                    Toast.makeText(Register.this, "Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(Register.this, "Error"+e.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    private void uploaData() {
      dbRef=   reference.child("user");
      String key=dbRef.push().getKey();

        HashMap<String,String> user = new HashMap<>();
        user.put("key",key);
        user.put("name",name);
        user.put("email",email);
        user.put("password",password);

        dbRef.child(key).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Register.this, "User Created", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Register.this,Login.class));
                    finish();


                }else {
                    Toast.makeText(Register.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Register.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}