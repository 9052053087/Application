package com.example.login_register;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText getmTextPassword;
    Button mButtonLogin;
    TextView mTextViewRegister;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextUsername=(EditText)findViewById(R.id.edittext_username);
        getmTextPassword =(EditText)findViewById(R.id.edittext_password);
        mButtonLogin= (Button) findViewById(R.id.button_login);
        mTextViewRegister=(EditText)findViewById(R.id.textview_register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
            }
        });
    }
}