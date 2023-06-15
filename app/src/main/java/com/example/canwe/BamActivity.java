package com.example.canwe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BamActivity extends AppCompatActivity {

    Button btn1_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bam);
        btn1_add = findViewById(R.id.btn1_add);


        btn1_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BamActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}