package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    Button btnRed, btnBlue;
    int scoreRed = 0,scoreBlue = 0;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreBlue++;
            }
        });

        btnRed.setOnLongClickListener(this);

    }

    private void initViews() {
        btnBlue = findViewById(R.id.btnBlue);
        btnRed = findViewById(R.id.btnRed);
    }


    @Override
    public boolean onLongClick(View v) {
        scoreRed+=2;
        return false;
    }

    public void go(View view) {
        Intent si = new Intent(this,Scores.class);
        si.putExtra("Red",scoreRed);
        si.putExtra("Blue",scoreBlue);
        startActivity(si);

    }
}