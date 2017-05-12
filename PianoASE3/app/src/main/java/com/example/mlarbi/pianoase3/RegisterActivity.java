package com.example.mlarbi.pianoase3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText name,un,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    public void register(View view)
    {
        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
        User newUser = new User();
        name = (EditText) findViewById(R.id.editText3);
        un = (EditText) findViewById(R.id.editText4);
        pass = (EditText) findViewById(R.id.editText5);
        newUser.name = name.getText().toString();
        newUser.userName = un.getText().toString();
        newUser.pass = pass.getText().toString();
        newUser.val = true;

        startActivity(intent);
//        User newUser = new User();
//        name = (EditText) findViewById(R.id.editText3);
//        un = (EditText) findViewById(R.id.editText4);
//        pass = (EditText) findViewById(R.id.editText5);
//        newUser.name = name.getText().toString();
//        newUser.userName = un.getText().toString();
//        newUser.pass = pass.getText().toString();
//        newUser.val = true;
//        intent.putExtra("UserInfo", newUser);
//        startActivity(intent);
    }
}
