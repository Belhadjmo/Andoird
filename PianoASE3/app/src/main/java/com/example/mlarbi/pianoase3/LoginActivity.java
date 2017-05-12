package com.example.mlarbi.pianoase3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Context ctx;
    AlertDialog dialogError;
    EditText name,password;
    public String regName = "Belhadj";
    public String regUN="Mohammad";
    public String regPass = "hi";
    boolean isReg = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

    public void register(View view) {

        Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(intent);
    }


    public void loginField(View view)
    {
        name = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        String nameText = (String) name.getText().toString();
        String passText = (String) password.getText().toString();

        if(nameText.equals("Mohammad") && passText.equals("hi"))
        {
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(intent);
        }

    }



}
