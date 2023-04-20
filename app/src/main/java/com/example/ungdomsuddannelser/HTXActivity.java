package com.example.ungdomsuddannelser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HTXActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htxactivity);
    }

    public void backToEducation(View view) {
        Intent toEducation = new Intent(this, activity_education.class);
        startActivity(toEducation);
    }
}