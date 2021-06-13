package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

class loginActivity extends AppCompatActivity {
    EditText etemail,etpassword;
    Button btnSignup, btnSignin;

    public static final String main_key="my ref";

    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etemail=findViewById(R.id.etemail);
        etpassword=findViewById(R.id.etpassword);
        btnSignin=findViewById(R.id.btnSignin);
        btnSignup=findViewById(R.id.btnSignup);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEmail,userPassword;
                userEmail=etemail.getText().toString();
                userPassword=etpassword.getText().toString();

                SharedPreferences preferences=getSharedPreferences(main_key,MODE_PRIVATE);
                String email= preferences.getString(email_key,"");
                String password=preferences.getString(password_key,"");

                if (userEmail.equals(email) && userPassword.equals(password)){
                    Intent intent=new Intent(loginActivity.this,Home.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(loginActivity.this, "Invalid Login Details....", Toast.LENGTH_SHORT).show();
                }

            }
        });


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginActivity.this, Signup.class);
                startActivity(intent);
            };


        });
    }}