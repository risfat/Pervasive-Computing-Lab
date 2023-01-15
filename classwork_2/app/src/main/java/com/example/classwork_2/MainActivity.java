package com.example.classwork_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String extraMarks;
    int C;
    RadioGroup RG;
    TextView resultView;
    int marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RG = findViewById(R.id.btnRadioGroup);
        resultView = findViewById(R.id.result);
        C=0;
    }

    public void questionChecker(View view) {
        if (C<4){
            if (RG.getCheckedRadioButtonId() == R.id.btnR4){
                marks=1;
            }else{
                marks=0;
            }
            C++;
            resultView.setText("You Got: "+marks);
        }else {
            Toast.makeText(this,"Can't Attempt More Than 3",Toast.LENGTH_LONG).show();
        }

        Intent myIntent=new Intent(this,MainActivity2.class);
        myIntent.putExtra(extraMarks,marks);
        startActivity(myIntent);
    }
}