package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNum, secondNum;
    TextView resultText;
    double num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        resultText = findViewById(R.id.resultText);
    }



    public void Plus() {
        num1 = Double.parseDouble(firstNum.getText().toString());
        num2 = Double.parseDouble(secondNum.getText().toString());

        result = num1 + num2;
        resultText.setText(""+result);

    }

    public void Minus() {
        num1 = Double.parseDouble(firstNum.getText().toString());
        num2 = Double.parseDouble(secondNum.getText().toString());

        result = num1 - num2;
        resultText.setText(""+result);
    }

    public void Multi() {
        num1 = Double.parseDouble(firstNum.getText().toString());
        num2 = Double.parseDouble(secondNum.getText().toString());

        result = num1 * num2;
        resultText.setText(""+result);
    }

    public void Divide() {
        num1 = Double.parseDouble(firstNum.getText().toString());
        num2 = Double.parseDouble(secondNum.getText().toString());

        result = num1 / num2;
        resultText.setText(""+result);
    }

    public void calFunc(View v) {
        switch (v.getId()) {
            case R.id.plusButton:
                Plus();
                break;
            case R.id.minusButton:
                Minus();
                break;
            case R.id.multiButton:
                Multi();
                break;
            case R.id.divideButton:
                Divide();
                break;
            default:
                resultText.setText("Something Went Wrong...");
                break;

        }

    }
}