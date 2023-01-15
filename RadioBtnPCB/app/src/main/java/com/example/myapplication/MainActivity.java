package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final static String ExtraMarks="This is From Activity one";
    RadioGroup myRadioGroup;
    int marks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRadioGroup = findViewById(R.id.radioGroupID);
    }

    public void nextFunction(View view) {
        if (myRadioGroup.getCheckedRadioButtonId() == R.id.radioBtn4ID) {
            marks = 5;
        } else {
            marks = 0;
        }
        Intent myIntent=new Intent(this,MainActivity2.class);
        myIntent.putExtra(ExtraMarks,marks);
        startActivity(myIntent);

    }
}