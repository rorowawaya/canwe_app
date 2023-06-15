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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class HomemadeActivity extends AppCompatActivity {

    Button umbutton;
    Button fabutton;
    Button abbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homemade);
        umbutton=findViewById(R.id.umbutton);
        abbutton=findViewById(R.id.abbutton);
        fabutton=findViewById(R.id.fabutton);

        umbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomemadeActivity.this,UmActivity.class);
                startActivity(intent);
            }
        });
        abbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomemadeActivity.this,AbActivity.class);
                startActivity(intent);
            }
        });
        fabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomemadeActivity.this,FaActivity.class);
                startActivity(intent);
            }
        });

    }
}