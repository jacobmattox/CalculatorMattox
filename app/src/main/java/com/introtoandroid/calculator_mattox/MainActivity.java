package com.introtoandroid.calculator_mattox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button clear;
    private Button clearEverything;
    private Button plusMinus;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button equals;
    private Button decimal;
    private TextView textView;
    private String inputString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        clear = findViewById(R.id.c);
        clearEverything = findViewById(R.id.ce);
        plusMinus = findViewById(R.id.plusMinus);
        plus = findViewById(R.id.addition);
        minus = findViewById(R.id.subtraction);
        multiply = findViewById(R.id.multiplication);
        divide = findViewById(R.id.division);
        equals = findViewById(R.id.equal);
        decimal = findViewById(R.id.decimal);
        textView = findViewById(R.id.textView);
        inputString = "";

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "1";
                textView.setText(inputString);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "2";
                textView.setText(inputString);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "3";
                textView.setText(inputString);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "4";
                textView.setText(inputString);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "5";
                textView.setText(inputString);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "6";
                textView.setText(inputString);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "7";
                textView.setText(inputString);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "8";
                textView.setText(inputString);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "9";
                textView.setText(inputString);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + "0";
                textView.setText(inputString);
            }
        });
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = "";
                textView.setText(inputString);
            }
        });









    }
}
