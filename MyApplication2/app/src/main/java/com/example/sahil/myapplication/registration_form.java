package com.example.sahil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class registration_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        user=(EditText)findViewById(R.id.username);
        p=(EditText)findViewById(R.id.password);
        submit=(Button) findViewById(R.id.button);
        l=(Button) findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(registration_form.this,login.class);
                startActivity(i);
            }
        });

    }
}
