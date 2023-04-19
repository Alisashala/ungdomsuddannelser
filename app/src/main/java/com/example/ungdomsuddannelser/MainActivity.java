package com.example.ungdomsuddannelser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addProgram();

    }

    public void clickedButton(View view) {
        Intent toMenu = new Intent(this, MenuActivity.class);
        startActivity(toMenu);
    }







    public void addProgram(){

        StudyProgramme program1 = new StudyProgramme("International musik", "Kort beskrivelse","Kunst");


        ArrayList<StudyProgramme> studyProgrammes = new ArrayList<>();
        studyProgrammes.add(program1);
        HashMap<String,Object> data = new HashMap<>();
        data.put("programme", studyProgrammes);

        // Add a new document with a generated ID
        db.collection("Studyprogrammes")
                .add(data)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        System.out.println("added");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        System.out.println("error");
                        System.out.println(e);
                    }
                });




}}

