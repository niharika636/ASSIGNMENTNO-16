package com.example.sahil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.login);
        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){

                String user=username.getText().toString();
                String pass=password.getText().toString();
                if(user.equals("") && pass.equals("")){
                    Toast.makeText(getApplicationContext(), "Enter Username/Password", Toast.LENGTH_SHORT).show();
                }
                else if(user.equals(username) && pass.equals(password)){
                    Toast.makeText(getApplicationContext(), "Login Successful!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Invalid Username/Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}