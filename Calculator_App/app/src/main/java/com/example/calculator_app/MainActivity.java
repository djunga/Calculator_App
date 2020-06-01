package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPlusButton();
        initMinusButton();
        initMultiplyButton();
        initDivideButton();
    }
    private void initDivideButton() {
        Button divideButton = findViewById(R.id.buttonDivide);
        divideButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editFirstNum = findViewById(R.id.editTextFirstNum);
                double firstNum = Double.parseDouble(editFirstNum.getEditableText().toString());
                EditText editSecondNum = findViewById(R.id.editTextSecondNum);
                double secondNum = Double.parseDouble(editSecondNum.getEditableText().toString());
                double quotient = firstNum/secondNum;
                String answer = "Answer: " + Math.round(quotient*100.0) / 100.0;
                //Resources res = getResources();
                //String answerString = res.getString(R.string.answer);
                TextView ans = findViewById(R.id.textViewAnswer);
                ans.setText(answer);
            }
        });
    }
    private void initMultiplyButton() {
        Button multiplyButton = findViewById(R.id.buttonMultiply);
        multiplyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editFirstNum = findViewById(R.id.editTextFirstNum);
                double firstNum = Double.parseDouble(editFirstNum.getEditableText().toString());
                EditText editSecondNum = findViewById(R.id.editTextSecondNum);
                double secondNum = Double.parseDouble(editSecondNum.getEditableText().toString());
                double product = firstNum*secondNum;
                String answer = "Answer: " + Math.round(product*100.0) / 100.0;
                //Resources res = getResources();
                //String answerString = res.getString(R.string.answer);
                TextView ans = findViewById(R.id.textViewAnswer);
                ans.setText(answer);
            }
        });
    }
    private void initMinusButton() {
        Button minusButton = findViewById(R.id.buttonMinus);
        minusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editFirstNum = findViewById(R.id.editTextFirstNum);
                double firstNum = Double.parseDouble(editFirstNum.getEditableText().toString());
                EditText editSecondNum = findViewById(R.id.editTextSecondNum);
                double secondNum = Double.parseDouble(editSecondNum.getEditableText().toString());
                double difference = firstNum-secondNum;
                String answer = "Answer: " + Math.round(difference*100.0) / 100.0;
                //Resources res = getResources();
                //String answerString = res.getString(R.string.answer);
                TextView ans = findViewById(R.id.textViewAnswer);
                ans.setText(answer);
            }
        });
    }
    private void initPlusButton() {
        Button plusButton = findViewById(R.id.buttonPlus);
        plusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText editFirstNum = findViewById(R.id.editTextFirstNum);
                double firstNum = Double.parseDouble(editFirstNum.getEditableText().toString());
                EditText editSecondNum = findViewById(R.id.editTextSecondNum);
                double secondNum = Double.parseDouble(editSecondNum.getEditableText().toString());
                //double roundOff = Math.round(a * 100.0) / 100.0;
                double sum = firstNum+secondNum;
                String answer = "Answer: " + Math.round(sum*100.0) / 100.0;
                //Resources res = getResources();
                //String answerString = res.getString(R.string.answer);
                TextView ans = findViewById(R.id.textViewAnswer);
                ans.setText(answer);
            }
        });
    }
}