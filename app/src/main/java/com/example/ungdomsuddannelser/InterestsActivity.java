package com.example.ungdomsuddannelser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InterestsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
    }
    public void toNaturvidenskab(View view) {
        Intent toMenu = new Intent(this, NaturvidenskabActivity.class);
        startActivity(toMenu);
    }
    public void toSamfundsvidenskab(View view) {
        Intent toMenu = new Intent(this, SamfundsvidenskabActivity.class);
        startActivity(toMenu);
    }
    public void toSprog(View view) {
        Intent toMenu = new Intent(this, SprogActivity.class);
        startActivity(toMenu);
    }
    public void toKunst(View view) {
        Intent toMenu = new Intent(this, KunstActivity.class);
        startActivity(toMenu);
    }

    public void backToMenu(View view) {
        Intent toMenu = new Intent(this, MenuActivity.class);
        startActivity(toMenu);
    }
}