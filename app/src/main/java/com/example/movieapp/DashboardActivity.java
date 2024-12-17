package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        bt1=(Button) findViewById(R.id.am);
        bt2=(Button) findViewById(R.id.sm);
        bt3=(Button) findViewById(R.id.vm);
        bt4=(Button) findViewById(R.id.et);


        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob=new Intent(getApplicationContext(),ViewAllMovies.class);
                startActivity(ob);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ob=new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(ob);
            }
        });

    }
}