package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText amount_to_be_converted, get_height, get_weight;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amount_to_be_converted = findViewById(R.id.amount);
        get_height = findViewById(R.id.height);
        get_weight = findViewById(R.id.weight);
        resultText = findViewById(R.id.resultText);
    }


    public void bdt(){
        double amount = Double.parseDouble(amount_to_be_converted.getText().toString());
        double result = amount * 87.99 ;
        resultText.setText(""+String.format("%.2f",result)+" TAKA");

    }

    public void bmi(){

        double height = Double.parseDouble(get_height.getText().toString());
        double weight = Double.parseDouble(get_weight.getText().toString());

        double bmi = weight / (height * height);

        Toast.makeText(this, "BMI: "+bmi, Toast.LENGTH_LONG).show();
    }

    public void calFunc(View v) {
        switch (v.getId()) {
            case R.id.convertToBdt:
                bdt();
                break;
            case R.id.bmi:
                bmi();
                break;

            default:
                resultText.setText("Something Went Wrong...");
                break;

        }

    }
}