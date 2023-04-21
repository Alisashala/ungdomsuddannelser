package com.example.ungdomsuddannelser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
    }

    public void backToMenu(View view) {
        Intent toMenu = new Intent(this, MenuActivity.class);
        startActivity(toMenu);
    }

    public void toHTX(View view) {
        Intent toHTX = new Intent(this, HTXActivity.class);
        startActivity(toHTX);
    }
    public void toHHX(View view) {
        Intent toHHX = new Intent(this, HHXActivity.class);
        startActivity(toHHX);
    }

}