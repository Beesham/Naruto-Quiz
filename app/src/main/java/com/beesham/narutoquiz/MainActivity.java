package com.beesham.narutoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton question1AnswerRadiobutton;
    private RadioButton question2AnswerRadiobutton;
    private RadioButton question3AnswerRadiobutton;
    private RadioButton question4AnswerRadiobutton;
    private RadioButton question5AnswerRadiobutton;
    private RadioButton question6AnswerRadiobutton;
    private RadioButton question7AnswerRadiobutton;
    private RadioButton question8AnswerRadiobutton;
    private RadioButton question9AnswerRadiobutton;
    private RadioButton question10AnswerRadiobutton;

    private CheckBox question11Checkbox1;
    private CheckBox question11Checkbox2;
    private CheckBox question11Checkbox3;
    private CheckBox question11Checkbox4;

    private EditText question12Edittext;

    private int grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1AnswerRadiobutton = (RadioButton) findViewById(R.id.q1_answer);
        question2AnswerRadiobutton = (RadioButton) findViewById(R.id.q2_answer);
        question3AnswerRadiobutton = (RadioButton) findViewById(R.id.q3_answer);
        question4AnswerRadiobutton = (RadioButton) findViewById(R.id.q4_answer);
        question5AnswerRadiobutton = (RadioButton) findViewById(R.id.q5_answer);
        question6AnswerRadiobutton = (RadioButton) findViewById(R.id.q6_answer);
        question7AnswerRadiobutton = (RadioButton) findViewById(R.id.q7_answer);
        question8AnswerRadiobutton = (RadioButton) findViewById(R.id.q8_answer);
        question9AnswerRadiobutton = (RadioButton) findViewById(R.id.q9_answer);
        question10AnswerRadiobutton = (RadioButton) findViewById(R.id.q10_answer);

        question11Checkbox1 = (CheckBox) findViewById(R.id.hand_sign_question_checkbox1);
        question11Checkbox2 = (CheckBox) findViewById(R.id.hand_sign_question_checkbox2);
        question11Checkbox3 = (CheckBox) findViewById(R.id.hand_sign_question_checkbox3);
        question11Checkbox4 = (CheckBox) findViewById(R.id.hand_sign_question_checkbox4);

        question12Edittext = (EditText) findViewById(R.id.q12_edittext);

    }

    public void gradeQuiz(View view) {
        if (question1AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question2AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question3AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question4AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question5AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question6AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question7AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question8AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question9AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question10AnswerRadiobutton.isChecked()) {
            grade++;
        }
        if (question11Checkbox1.isChecked() && !question11Checkbox2.isChecked() && question11Checkbox3.isChecked() && question11Checkbox4.isChecked()) {
            grade++;
        }
        if(question12Edittext.getText().length() > 0){
            if(question12Edittext.getText().toString().trim().toLowerCase().equals(getString(R.string.q12_answer))){
                grade++;
            }
        }


        if(grade > 0){
            Toast.makeText(this, getString(R.string.results, grade), Toast.LENGTH_SHORT).show();
            grade = 0;  // Reset grade so it doesnt build on itself
        }else{
            Toast.makeText(this, getString(R.string.results_bad), Toast.LENGTH_SHORT).show();
        }
    }


}
