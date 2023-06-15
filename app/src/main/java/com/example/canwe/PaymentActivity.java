package com.example.canwe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {
    EditText password;
    EditText num;
    EditText cv;
    Button subnBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        password = findViewById(R.id.password);
        num = findViewById(R.id.num);
        cv = findViewById(R.id.cv);
        subnBtn = findViewById(R.id.subnBtn);


        subnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(PaymentActivity.this,ThankyouActivity.class);
                startActivity(intent);
            }
        });

    }
}