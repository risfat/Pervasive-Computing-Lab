package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    int Totalmarks;
    RadioGroup myRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent myIntent = getIntent();
        Totalmarks = myIntent.getIntExtra(MainActivity.ExtraMarks, 0);
        myRadioGroup = findViewById(R.id.q2radioGroupID);
    }

    public void submitFunction(View view) {
        if (myRadioGroup.getCheckedRadioButtonId() == R.id.q2radioBtn1ID) {
            Totalmarks=Totalmarks+5;
        } else {
            Totalmarks=Totalmarks+0;
        }
        Toast.makeText(this, ""+Totalmarks, Toast.LENGTH_SHORT).show();
    }
}