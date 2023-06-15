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

public class ResturantActivity extends AppCompatActivity {

    Button bambutton;
    Button yubutton;
    Button labutton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant);
        bambutton=findViewById(R.id.bambutton);
        yubutton=findViewById(R.id.yubutton);
        labutton=findViewById(R.id.labutton);

        bambutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResturantActivity.this,BamActivity.class);
                startActivity(intent);
            }
        });
        yubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResturantActivity.this,YumActivity.class);
                startActivity(intent);
            }
        });
        labutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ResturantActivity.this,LaActivity.class);
                startActivity(intent);
            }
        });

    }
}