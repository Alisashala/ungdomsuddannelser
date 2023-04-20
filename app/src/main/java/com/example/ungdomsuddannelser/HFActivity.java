package com.example.ungdomsuddannelser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hfactivity);
    }

    public void backToEducation(View view) {
        Intent toEducation = new Intent(this, activity_education.class);
        startActivity(toEducation);
    }
}