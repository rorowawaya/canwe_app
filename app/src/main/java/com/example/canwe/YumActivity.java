package com.example.canwe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YumActivity extends AppCompatActivity {

    Button yybtn;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yum);
        yybtn = findViewById(R.id.yybtn);

        yybtn.setOnClickListener(view -> {
            Intent intent = new Intent(YumActivity.this, PaymentActivity.class);
            startActivity(intent);

        });
    }
}
