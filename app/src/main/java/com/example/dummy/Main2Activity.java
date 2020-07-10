package com.example.dummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String user = getIntent().getStringExtra("user");

        TextView txtWelcomeMessage = findViewById(R.id.welcome_message);
        txtWelcomeMessage.append(", " + user);
    }
}
