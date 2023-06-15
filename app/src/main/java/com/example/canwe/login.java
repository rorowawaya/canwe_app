package com.example.canwe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    Button usBtn;
    Button paBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usBtn =findViewById(R.id.usBtn);
        paBtn =findViewById(R.id.paBtn);

        usBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login.this,Registerr.class);
                startActivity(intent);
            }
        });

        paBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(login.this,Registerr.class);
                startActivity(intent);
            }
        });

    }
}