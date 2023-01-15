package com.example.classwork_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup RG;
    int marks;
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RG = findViewById(R.id.btnRadioGroup);
        resultView = findViewById(R.id.result);
        Intent myIntent = getIntent();
        marks = myIntent.getIntExtra(MainActivity.extraMarks,0);
    }

    public void questionChecker(View view) {

            if (RG.getCheckedRadioButtonId() == R.id.btnR1){
                marks++;

            }else{
                Toast.makeText(this,"Wrong Ans",Toast.LENGTH_SHORT).show();
            }

        resultView.setText("You Got: "+marks);


    }
}