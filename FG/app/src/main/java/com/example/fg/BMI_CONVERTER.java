package com.example.fg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI_CONVERTER extends AppCompatActivity {

    EditText get_height, get_weight;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_converter);
        resultText = findViewById(R.id.resultText);
        get_height = findViewById(R.id.height);
        get_weight = findViewById(R.id.weight);
    }


    public void bmiFunc(View view) {
        double height = Double.parseDouble(get_height.getText().toString());
        double weight = Double.parseDouble(get_weight.getText().toString());

        double bmi = weight / (height * height);

        resultText.setText(""+bmi);

    }

    public void homeFunc(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}