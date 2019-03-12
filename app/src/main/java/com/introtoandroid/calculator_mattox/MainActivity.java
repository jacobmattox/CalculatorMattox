package com.introtoandroid.calculator_mattox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;
import java.math.BigInteger;

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
    private Button reciprocal;
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
    private String lastSecondOperand;


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
        reciprocal = findViewById(R.id.reciprocal);
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
        lastSecondOperand = null;


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.one);
                textView.setText(inputString);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.two);
                textView.setText(inputString);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.three);
                textView.setText(inputString);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.four);
                textView.setText(inputString);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.five);
                textView.setText(inputString);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.six);
                textView.setText(inputString);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.seven);
                textView.setText(inputString);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.eight);
                textView.setText(inputString);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = inputString + getString(R.string.nine);
                textView.setText(inputString);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   inputString = inputString + getString(R.string.zero);
                   textView.setText(inputString);
            }
        });
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = getString(R.string.empty);
                textView.setText(inputString);
                firstOperand = null;
                secondOperand = null;
                operator = null;
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString.length() > 0){
                    inputString = inputString.substring(0, inputString.length()-1);
                    textView.setText(inputString);
                }


            }
        });
        plusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputString != getString(R.string.empty)) {
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
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString != getString(R.string.empty) && Double.parseDouble(inputString) % 1 == 0 && Double.parseDouble(inputString) > 0){
                    inputString = factorial(inputString);
                    textView.setText(inputString);
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.ToastPositiveInteger), Toast.LENGTH_SHORT);
                    clearEverything.performClick();
                }
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = Double.toString(Math.PI);
                textView.setText(inputString);
            }
        });
        euler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputString = Double.toString(Math.E);
                textView.setText(inputString);
            }
        });
        squared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString != getString(R.string.empty)){
                    double s = Double.parseDouble(inputString);
                    s = s * s;
                    if(s % 1 == 0){
                        inputString = Integer.toString((int) s);
                    }
                    else{
                        inputString = Double.toString(s);
                    }
                }
                textView.setText(inputString);
            }
        });
        squareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString != getString(R.string.empty)){
                    double s = Double.parseDouble(inputString);
                    s = Math.pow(s, .5);
                    if(s % 1 == 0){
                        inputString = Integer.toString((int) s);
                    }
                    else{
                        inputString = Double.toString(s);
                    }
                }
                textView.setText(inputString);

            }
        });
        reciprocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString != getString(R.string.empty)){
                    double s = Double.parseDouble(inputString);
                    s = 1/s;
                    inputString = Double.toString(s);
                }
                textView.setText(inputString);
            }
        });
        logBaseTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString != getString(R.string.empty)){
                    double s = Double.parseDouble(inputString);
                    s = Math.log10(s)/Math.log10(2);
                    if(s % 1 == 0){
                        inputString = Integer.toString((int) s);
                    }
                    else{
                        inputString = Double.toString(s);
                    }
                }
                textView.setText(inputString);
            }
        });
        logBaseTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputString != getString(R.string.empty)){
                    double s = Double.parseDouble(inputString);
                    s = Math.log10(s);
                    if(s % 1 == 0){
                        inputString = Integer.toString((int) s);
                    }
                    else{
                        inputString = Double.toString(s);
                    }
                }
                textView.setText(inputString);

            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != getString(R.string.empty)) {
                    operator = '+';
                    firstOperand = inputString;
                    inputString = getString(R.string.empty);
                }
                else if (inputString != getString(R.string.empty)){
                    secondOperand = inputString;
                    inputString = getString(R.string.empty);
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '+';
                    textView.setText(firstOperand);
                }
                else if(operator == null && inputString == getString(R.string.empty)){
                    operator = '+';
                    lastOperator = null;
                    secondOperand = null;
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != getString(R.string.empty)) {
                    operator = '-';
                    firstOperand = inputString;
                    inputString = getString(R.string.empty);
                }
                else if (inputString != getString(R.string.empty)){
                    secondOperand = inputString;
                    inputString = getString(R.string.empty);
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '-';
                    textView.setText(firstOperand);
                }
                else if(operator == null && inputString == getString(R.string.empty)){
                    operator = '-';
                    lastOperator = null;
                    secondOperand = null;
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != getString(R.string.empty)) {
                    operator = '*';
                    firstOperand = inputString;
                    inputString = getString(R.string.empty);
                }
                else if (inputString != getString(R.string.empty)){
                    secondOperand = inputString;
                    inputString = getString(R.string.empty);
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '*';
                    textView.setText(firstOperand);
                }
                else if(operator == null && inputString == getString(R.string.empty)){
                    operator = '*';
                    lastOperator = null;
                    secondOperand = null;
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != getString(R.string.empty)) {
                    operator = '/';
                    firstOperand = inputString;
                    inputString = getString(R.string.empty);
                }
                else if (inputString != getString(R.string.empty)){
                    secondOperand = inputString;
                    inputString = getString(R.string.empty);
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '/';
                    textView.setText(firstOperand);
                }
                else if(operator == null && inputString == getString(R.string.empty)){
                    operator = '/';
                    lastOperator = null;
                    secondOperand = null;
                }
            }
        });
        xPowerY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operator == null && inputString != getString(R.string.empty)) {
                    operator = '^';
                    firstOperand = inputString;
                    inputString = getString(R.string.empty);
                }
                else if (inputString != getString(R.string.empty)){
                    secondOperand = inputString;
                    inputString = getString(R.string.empty);
                    firstOperand = onEquals(firstOperand, operator, secondOperand);
                    operator = '^';
                    textView.setText(firstOperand);
                }
                else if(operator == null && inputString == getString(R.string.empty)){
                    operator = '^';
                    lastOperator = null;
                    secondOperand = null;
                }

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstOperand != null && operator != null && secondOperand == null && inputString != getString(R.string.empty) && inputString != "."){
                    secondOperand = inputString;
                    inputString = getString(R.string.empty);
                    returnedAnswer = onEquals(firstOperand, operator, secondOperand);
                    textView.setText(returnedAnswer);
                    lastOperator = operator;
                    operator = null;
                    firstOperand = returnedAnswer;
                    lastSecondOperand = secondOperand;
                    secondOperand = null;
                }
                else if(lastOperator != null && firstOperand != null && inputString == getString(R.string.empty)){
                    returnedAnswer = onEquals(firstOperand, lastOperator, lastSecondOperand);
                    textView.setText(returnedAnswer);
                    firstOperand = returnedAnswer;
                }
            }
        });



    }
    public String onEquals(String operandOne, Character operator, String operandTwo){
        double firstOperand = Double.parseDouble(operandOne);
        double secondOperand = Double.parseDouble(operandTwo);
        double answer = 0.0;
        String returnString = getString(R.string.empty);

        switch (operator){
            case '*':
                answer = firstOperand * secondOperand;
                break;
            case '/':
                if(secondOperand != 0.0){
                    answer = firstOperand / secondOperand;
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.toastDivideByZero), Toast.LENGTH_SHORT);
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
            case '^':
                answer = Math.pow(firstOperand, secondOperand);

        }
        if(answer % 1 == 0){
            returnString = Integer.toString((int) answer);
        }
        else{
            returnString = Double.toString(answer);
        }

        return returnString;

    }

    public String factorial(String number){
        int n = Integer.parseInt(number);
        BigInteger numberToReturn = BigInteger.valueOf(1);

        for(int i = 1; i <= n; i++){
            numberToReturn = numberToReturn.multiply(BigInteger.valueOf(i));
        }
        return numberToReturn.toString();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(inputString != getString(R.string.empty)){outState.putString("inputString", inputString);}
        if(operator != null){outState.putString("operator", operator.toString());}
        if(firstOperand != null){outState.putString("firstOperand", firstOperand);}
        if(secondOperand != null){outState.putString("secondOperand", secondOperand);}
        outState.putString("currentScreen", textView.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        try{
            inputString = savedInstanceState.getString("inputString");
        }
        catch(Exception e){inputString = getString(R.string.empty);}
        try{
            operator = savedInstanceState.getString("operator").charAt(0);
            Log.v("operator", operator.toString());
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
        if(inputString == null){
            inputString = getString(R.string.empty);
        }
        String currentScreen = savedInstanceState.get("currentScreen").toString();
        if(currentScreen != null){
            textView.setText(currentScreen);
        }
        else {
            textView.setText(inputString);
        }
    }
}
