package com.example.calculator_pc_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView primaryView,secondaryView;
String primaryValue;
Double num1,num2,result;
char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primaryView=findViewById(R.id.primary_TextViewID);
        secondaryView=findViewById(R.id.secondary_TextViewID);
    }

    public void numBtnFunction(View view) {
        primaryValue=primaryView.getText().toString();
        if(primaryValue.equals("0")){
            if(view.getId()==R.id.zeroBtnID){
                primaryView.setText(""+0);
            }
            else if(view.getId()==R.id.oneBtnID){
                primaryView.setText(""+1);
            }
            else if(view.getId()==R.id.twoBtnID){
                primaryView.setText(""+2);
            }
            else if(view.getId()==R.id.threeBtnID){
                primaryView.setText(""+3);
            }
            else if(view.getId()==R.id.fourBtnID){
                primaryView.setText(""+4);
            }
            else if(view.getId()==R.id.fiveBtnID){
                primaryView.setText(""+5);
            }
            else if(view.getId()==R.id.sixBtnID){
                primaryView.setText(""+6);
            }
            else if(view.getId()==R.id.sevenBtnID){
                primaryView.setText(""+7);
            }
            else if(view.getId()==R.id.eightBtnID){
                primaryView.setText(""+8);
            }
            else {
                primaryView.setText(""+9);
            }
        }
        else {
            if(view.getId()==R.id.zeroBtnID){
                primaryView.setText(primaryValue+0);
            }
            else if(view.getId()==R.id.oneBtnID){
                primaryView.setText(primaryValue+1);
            }
            else if(view.getId()==R.id.twoBtnID){
                primaryView.setText(primaryValue+2);
            }
            else if(view.getId()==R.id.threeBtnID){
                primaryView.setText(primaryValue+3);
            }
            else if(view.getId()==R.id.fourBtnID){
                primaryView.setText(primaryValue+4);
            }
            else if(view.getId()==R.id.fiveBtnID){
                primaryView.setText(primaryValue+5);
            }
            else if(view.getId()==R.id.sixBtnID){
                primaryView.setText(primaryValue+6);
            }
            else if(view.getId()==R.id.sevenBtnID){
                primaryView.setText(primaryValue+7);
            }
            else if(view.getId()==R.id.eightBtnID){
                primaryView.setText(primaryValue+8);
            }
            else {
                primaryView.setText(primaryValue+9);
            }
        }


    }

    public void operatorFunction(View view) {

        primaryValue=primaryView.getText().toString();
        if(view.getId()==R.id.sumBtnID){
            operator='+';
        }
        else if(view.getId()==R.id.subBtnID){
            operator='-';
        }
        else if(view.getId()==R.id.multiBtnID){
            operator='*';
        }
        else {
            operator='/';
        }
        secondaryView.setText(primaryValue+operator);
        primaryView.setText(""+0);

        num1 = Double.parseDouble(primaryValue);


    }

    public void resultFunction(View view) {
        num2=Double.parseDouble(primaryView.getText().toString());
        if(operator=='+'){
            result=num1+num2;
        }
        else if(operator=='-'){
            result=num1-num2;
        }
        else if(operator=='*'){
            result=num1*num2;
        }
        else {
            result=num1/num2;
        }
        primaryView.setText(""+result);
        secondaryView.setText(""+num1+""+operator+""+num2+"=");
    }
}