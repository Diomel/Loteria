package com.lot.loteria.loteria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);

        final TextView welcomMessage = (TextView) findViewById(R.id.tvWelcommsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", - 1);

        String message = name + " welcome to your user area";
        welcomMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(age + "");
    }
}
