package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Scores extends AppCompatActivity {
    TextView tVBlue,tVRed;
    int scoreRed = 0, scoreBlue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        initViews();

        Intent gi = getIntent();
        scoreRed = gi.getIntExtra("Red",0);
        scoreBlue = gi.getIntExtra("Blue",0);
        tVRed.setText("red score: " + scoreRed);
        tVBlue.setText("Blue score: " + scoreBlue);
    }

    private void initViews() {
        tVBlue = findViewById(R.id.tVBlue);
        tVRed = findViewById(R.id.tVRed);
    }

    public void back(View view) {
        finish();
    }
}