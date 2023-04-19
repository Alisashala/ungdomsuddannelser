package com.example.ungdomsuddannelser;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class KunstActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    public void getStudyProgrammes (){
        TextView studyTitle = findViewById(R.id.titleTextView);
        TextView studyName = findViewById(R.id.textView1);
        TextView studyCategori = findViewById(R.id.textView2);
        TextView studyCourses = findViewById(R.id.textView3);
        TextView studyDescription = findViewById(R.id.textView4);



        db.collection("studyprogrammes")
                .document("Kunst1")
                .get()
                .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                        if (task.isSuccessful()) {
                            DocumentSnapshot document = task.getResult();
                            if (document.exists()) {
                                String name = document.getString("Navn");
                                String description = document.getString("Beskrivelse");
                                String Category = document.getString("Kategori");
                                List<String> courses = (List<String>) document.get("Fag");



                                studyTitle.setText("Uddannelse: " + name );
                                studyName.setText(name);
                                studyCategori.setText("Kategori: " + Category);
                                studyDescription.setText( "Beskrivelse: " + description);
                                studyCourses.setText("Fag: " + courses.toString());
                                System.out.println(document.getData());

                            } else {
                                System.out.println("No such document");
                            }
                        } else {
                            System.out.println(task.getException());
                        }
                    }
                });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kunst);
        getStudyProgrammes();
    }
}