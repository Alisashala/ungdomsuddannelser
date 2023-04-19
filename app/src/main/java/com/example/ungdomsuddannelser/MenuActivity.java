package com.example.ungdomsuddannelser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void educationInfo(View view) {

    }

    public void InterestInfo(View view) {
        Intent toInterest = new Intent(this,InterestsActivity.class);
        startActivity(toInterest);
    }

    public void backToMain(View view) {
        Intent toMain = new Intent(this, MainActivity.class);
        startActivity(toMain);

    }
}