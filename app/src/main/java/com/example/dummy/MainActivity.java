package com.example.dummy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText edtUser;
    private EditText edtPassword;
    private ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.username);
        edtPassword = findViewById(R.id.pass);
        constraintLayout = findViewById(R.id.constraint_layout);

        Button btnSignIn = findViewById(R.id.button);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = edtUser.getText().toString();
                String pass = edtPassword.getText().toString();

                if (edtUser.length() >=1 && pass.equals("123456789")){
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("user", user.trim());
                    startActivity(intent);
                }else {
                    Snackbar.make(constraintLayout, "Wrong password!!", Snackbar.LENGTH_LONG).show();
                }
            }
        });



    }
}
