package com.example.fg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner mySpinner;
    String func;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner=findViewById(R.id.spinnerId);
        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(this,R.array.navArray, R.layout.spinner_text_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(this);
    }

//    public void buttonFunc(View view) {
//
//        if (view.getId()==R.id.b1){
//            replaceFragments(new Fragment1());
//        }else {
//            replaceFragments(new Fragment2());
//        }
//
//    }

//    private void replaceFragments(Fragment fragment) {
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.fgArea,fragment);
//        ft.commit();
//
//    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        func =parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        func = null;
    }

    public void go(View view) {

        if (func.equals("BDT TO $")){

            Intent myIntent=new Intent(this,BDT_CONVERTER.class);
            startActivity(myIntent);
        }else {
            Intent myIntent=new Intent(this,BMI_CONVERTER.class);
            startActivity(myIntent);
        }

    }
}