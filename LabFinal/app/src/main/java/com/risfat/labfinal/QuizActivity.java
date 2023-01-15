package com.risfat.labfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {
String stu_id,stu_name;
RadioGroup myRadioGroup;
int marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        stu_id = getIntent().getStringExtra("stu_id");
        stu_name = getIntent().getStringExtra("stu_name");

    }

    public void quizCheck(View view) {

        if (view.getId() == R.id.radioBtnDhaka) {
            marks = 1;
        } else {
            marks = 0;
        }

        Toast.makeText(this, "Name: "+stu_name + "Student Id: "+stu_id + "Marks:"+marks, Toast.LENGTH_SHORT).show();

    }

    public void saveDB(View view) {

    }
}