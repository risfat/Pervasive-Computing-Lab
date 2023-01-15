package com.example.fg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BDT_CONVERTER extends AppCompatActivity {

    EditText amount_to_be_converted;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdt_converter);
        amount_to_be_converted = findViewById(R.id.amount);
        resultText = findViewById(R.id.resultText);
    }

    public void conFunc(View view) {
        double amount = Double.parseDouble(amount_to_be_converted.getText().toString());
        double result = amount / 87.99 ;
        resultText.setText(""+String.format("%.2f",result)+" $");

    }




    public void homeFunc(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}