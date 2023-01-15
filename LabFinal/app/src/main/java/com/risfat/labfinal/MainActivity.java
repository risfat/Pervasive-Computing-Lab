package com.risfat.labfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputStudentId,inputStudentName;
    final static String StuId="This is From Activity one";
    final static String StuName="This is From Activity one";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputStudentId = findViewById(R.id.inputStudentId);
        inputStudentName = findViewById(R.id.inputStudentName);
    }

    public void CalFunc(View view) {
        Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
        startActivity(intent);
    }

    public void quizFunc(View view) {
        Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
        intent.putExtra("stu_id",inputStudentId.getText().toString());
        intent.putExtra("stu_name",inputStudentName.getText().toString());
        startActivity(intent);
    }
}