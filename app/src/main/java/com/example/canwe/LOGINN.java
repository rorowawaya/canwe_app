package com.example.canwe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LOGINN extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginn);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("rawya") && password.getText().toString().equals("1234")) {
                    Toast.makeText(LOGINN.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LOGINN.this,Menu.class);
                    startActivities(new Intent[]{intent});
                } else {
                    Toast.makeText(LOGINN.this, "Login Failed!", Toast.LENGTH_SHORT).show();


                }
            }

        });
    }


}