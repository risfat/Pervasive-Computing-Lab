package com.risfat.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.classwork.R;

public class MainActivity extends AppCompatActivity {

    TextView secondTxt,primaryTxt;
    double firstNum, secondNum, result;
    String primaryValue, secondaryValue;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondTxt = findViewById(R.id.secondaryTxtView);
        primaryTxt = findViewById(R.id.primaryTxtView);
    }


    public void calFunc(View v) {

        primaryValue = primaryTxt.getText().toString();

        if (primaryValue.equals("0")) {

            switch (v.getId()) {

                case R.id.btnCe:
                    primaryTxt.setText("" + 0);
                    break;

                case R.id.btnC:
                    primaryTxt.setText("" + 0);
                    secondTxt.setText("");
                    break;

                case R.id.btn0:
                    primaryTxt.setText("" + 0);
                    break;

                case R.id.btn7:
                    primaryTxt.setText("" + 7);
                    break;

                case R.id.btn8:
                    primaryTxt.setText("" + 8);
                    break;

                case R.id.btn9:
                    primaryTxt.setText("" + 9);
                    break;

                case R.id.btn4:
                    primaryTxt.setText("" + 4);
                    break;

                case R.id.btn5:
                    primaryTxt.setText("" + 5);
                    break;

                case R.id.btn6:
                    primaryTxt.setText("" + 6);
                    break;

                case R.id.btn1:
                    primaryTxt.setText("" + 1);
                    break;

                case R.id.btn2:
                    primaryTxt.setText("" + 2);
                    break;

                case R.id.btn3:
                    primaryTxt.setText("" + 3);
                    break;

                case R.id.btnDot:
                    primaryTxt.setText(".");
                    break;

                default:
                    primaryTxt.setText(""+0);
                    break;

            }

        }else {
            switch (v.getId()) {
                case R.id.btnCe:
                    primaryTxt.setText("" + 0);
                    break;

                case R.id.btnC:
                    primaryTxt.setText("" + 0);
                    secondTxt.setText("");
                    break;

                case R.id.btn0:
                    primaryTxt.setText(primaryValue + 0);
                    break;

                case R.id.btn7:
                    primaryTxt.setText(primaryValue + 7);
                    break;

                case R.id.btn8:
                    primaryTxt.setText(primaryValue + 8);
                    break;

                case R.id.btn9:
                    primaryTxt.setText(primaryValue + 9);
                    break;

                case R.id.btn4:
                    primaryTxt.setText(primaryValue + 4);
                    break;

                case R.id.btn5:
                    primaryTxt.setText(primaryValue + 5);
                    break;

                case R.id.btn6:
                    primaryTxt.setText(primaryValue + 6);
                    break;

                case R.id.btn1:
                    primaryTxt.setText(primaryValue + 1);
                    break;

                case R.id.btn2:
                    primaryTxt.setText(primaryValue + 2);
                    break;

                case R.id.btn3:
                    primaryTxt.setText(primaryValue + 3);
                    break;

                case R.id.btnPDS:
                    double PV= Double.parseDouble(primaryTxt.getText().toString());
                    if (PV > 0){
                        primaryTxt.setText(""+-1*PV);
                    }else {
                        primaryTxt.setText("+"+Math.abs(PV));
                    }
                    break;

                case R.id.btnDot:
                    primaryTxt.setText(primaryValue+".");
                    break;

                case R.id.btnBack:
                    primaryValue=primaryValue.substring(0, primaryValue.length() - 1);
                    primaryTxt.setText(""+primaryValue);
                    break;

                default:
                    primaryTxt.setText("Something Went Wrong...");
                    break;

            }

        }

    }

    public void operatorFunc(View view) {

        primaryValue=primaryTxt.getText().toString();
        if(view.getId()==R.id.btnAdd){
            operator='+';
        }
        else if(view.getId()==R.id.btnSub){
            operator='-';
        }
        else if(view.getId()==R.id.btnMulti){
            operator='*';
        }
        else{
            operator='/';
        }
        secondTxt.setText(primaryValue+operator);
        primaryTxt.setText(""+0);

        firstNum = Double.parseDouble(primaryValue);
    }

    public void resultFunc(View view) {
        secondNum=Double.parseDouble(primaryTxt.getText().toString());
        if(operator=='+'){
            result=firstNum+secondNum;
        }
        else if(operator=='-'){
            result=firstNum-secondNum;
        }
        else if(operator=='*'){
            result=firstNum*secondNum;
        }
        else {
            result=firstNum/secondNum;
        }
        primaryTxt.setText(""+result);
        secondTxt.setText(""+firstNum+""+operator+""+secondNum+""+"=");
    }
}


