package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    Button b1;
    String getU, getP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.uname);
        e2 = (EditText) findViewById(R.id.pass);
        b1 = (Button) findViewById(R.id.logbut);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getU = e1.getText().toString().trim();
                getP = e2.getText().toString().trim();


                if (getU.equals("theatre") && getP.equals("123456")) {
                    Intent ob = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(ob);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid!!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
