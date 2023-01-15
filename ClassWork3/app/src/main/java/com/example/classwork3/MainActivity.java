package com.example.classwork3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText insertId, insertName, insertSec;
    public String name,id,sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertId = findViewById(R.id.insertId);
        insertName = findViewById(R.id.insertName);
        insertSec = findViewById(R.id.insertSection);
    }

    public void insertFunc(View view) {
        Toast.makeText(this,insertId.getText().toString(), Toast.LENGTH_LONG).show();

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance("https://class-work-3-default-rtdb.asia-southeast1.firebasedatabase.app/");
        DatabaseReference myRef = database.getReference("Students");

        name = insertName.getText().toString();
        id = insertId.getText().toString();
        sec = insertSec.getText().toString();

//        Map<String,Object> user = new HashMap<>();
//        user.put("name",name);
//        user.put("phone",sec);

        myRef.child(id).child("name").setValue(name);
        myRef.child(id).child("section").setValue(sec);
    }
}