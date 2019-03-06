package com.introtoandroid.calculator_mattox;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
    private Button decimal;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button equals;
    private Button logBaseTen;
    private Button logBaseTwo;
    private Button pi;
    private Button euler;
    private Button inverse;
    private Button squareRoot;
    private Button squared;
    private Button xPowerY;
    private Button factorial;
    private TextView textView;
    private String inputString;
    private String firstOperand;
    private String secondOperand;
    private Character operator;
    private Character lastOperator;
    private String returnedAnswer;


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
        logBaseTen = findViewById(R.id.logBaseTen);
        logBaseTwo = findViewById(R.id.logBaseTwo);
        pi = findViewById(R.id.pi);
        euler = findViewById(R.id.euler);
        inverse = findViewById(R.id.inverse);
        squareRoot = findViewById(R.id.squareRoot);
        squared = findViewById(R.id.squared);
        xPowerY = findViewById(R.id.raisedToPower);
        factorial = findViewById(R.id.factorial);

        textView = findViewById(R.id.textView);
        inputString = "";

        firstOperand = null;
        secondOperand = null;
        operator = null;

        returnedAnswer = null;
        lastOperator = null;

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
                firstOperand = null;
                secondOperand = null;
                operator = null;
            }
        });
//        clear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //need to fix c button unintended clears
//                hasDecimal = false;
//                inputString = "";
//                textView.setText(inputString);
//                if(operator != null){
//                    operator = null;
//                }
//
//
//            }
//        });
        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputString != "") {
                        Double temp = Double.valueOf(inputString);
                        temp = temp * -1;
                        inputString = temp.toString();
                        textView.setText(inputString);
                    }
                }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + '.';
                textView.setText(inputString);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != "") {
                    operator = '+';
                    firstOperand = inputString;
                    inputString = "";
                }
                else if (inputString != ""){
                    secondOperand = inputString;
                    inputString = "";
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '+';
                    textView.setText(firstOperand);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != "") {
                    operator = '-';
                    firstOperand = inputString;
                    inputString = "";
                }
                else if (inputString != ""){
                    secondOperand = inputString;
                    inputString = "";
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '-';
                    textView.setText(firstOperand);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != "") {
                    operator = '*';
                    firstOperand = inputString;
                    inputString = "";
                }
                else if (inputString != ""){
                    secondOperand = inputString;
                    inputString = "";
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '*';
                    textView.setText(firstOperand);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != "") {
                    operator = '/';
                    firstOperand = inputString;
                    inputString = "";
                }
                else if (inputString != ""){
                    secondOperand = inputString;
                    inputString = "";
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '/';
                    textView.setText(firstOperand);
                }
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstOperand != null && operator != null && secondOperand == null && inputString != "" && inputString != "."){
                    secondOperand = inputString;
                    inputString = "";
                    returnedAnswer = onEquals(firstOperand, operator, secondOperand);
                    textView.setText(returnedAnswer);
                    lastOperator = operator;
                    operator = null;
                    firstOperand = null;
                }
            }
        });



    }
    public String onEquals(String operandOne, Character operator, String operandTwo){
        double firstOperand = Double.parseDouble(operandOne);
        double secondOperand = Double.parseDouble(operandTwo);
        double answer = 0.0;
        String returnString = "";
        Log.v("zero", Double.toString(secondOperand));

        switch (operator){
            case '*':
                answer = firstOperand * secondOperand;
                break;
            case '/':
                if(secondOperand != 0.0){
                    answer = firstOperand / secondOperand;
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Can't divide by zero", Toast.LENGTH_SHORT);
                    toast.show();
                    clearEverything.performClick();
                    return null;
                }
                break;
            case '+':
                answer = firstOperand + secondOperand;
                break;
            case '-':
                answer = firstOperand - secondOperand;
                break;

        }
        if(answer % 1 == 0){
            returnString = Integer.toString((int) answer);
        }
        else{
            returnString = Double.toString(answer);
        }

        return returnString;

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(inputString != ""){outState.putString("inputString", inputString);}
        if(operator != null){outState.putString("operator", operator.toString());}
        if(firstOperand != null){outState.putString("firstOperand", firstOperand);}
        if(secondOperand != null){outState.putString("secondOperand", secondOperand);}

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        try{
            inputString = savedInstanceState.getString("inputString");
        }
        catch(Exception e){inputString = "";}
        try{
            operator = savedInstanceState.getString("operator").charAt(0);
        }
        catch(Exception e){}
        try{
            firstOperand = savedInstanceState.getString("firstOperand");
        }
        catch(Exception e){}
        try{
            secondOperand = savedInstanceState.getString("secondOperand");
        }
        catch(Exception e){}
        textView.setText(inputString);
    }
}
