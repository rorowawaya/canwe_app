package com.example.canwe;

import static com.example.canwe.R.id.logBtn;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThankyouActivity extends AppCompatActivity {
    Button logBtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        logBtn =findViewById(R.id.logBtn);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ThankyouActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
