package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult; // Reference to EditText of result
    private int result = 0;
    // Result of computation
    private String inStr = "0"; // Current input string
    // Previous operator: '+', '-', '*', '/', '=' or ' ' (no operator)
    private char lastOperator = ' ';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Retrieve a reference to the EditText field for displaying the result.
        txtResult = (TextView) findViewById(R.id.txtResultId);
        txtResult.setText("0");
// Register listener (this class) for all the buttons
        BtnListener listener = new BtnListener();
        ((Button) findViewById(R.id.btnNum0Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum1Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum2Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum3Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum4Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum5Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum6Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum7Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum8Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnNum9Id)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnSubId)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnMulId)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnDivId)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnClearId)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnEqualId)).setOnClickListener(listener);
        ((Button) findViewById(R.id.btnAddId)).setOnClickListener(listener);
    }
    private class BtnListener implements View.OnClickListener {
        // On-click event handler for all the buttons
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
// Number buttons: '0' to '9'
                case R.id.btnNum0Id:
                case R.id.btnNum1Id:
                case R.id.btnNum2Id:
                case R.id.btnNum3Id:
                case R.id.btnNum4Id:
                case R.id.btnNum5Id:
                case R.id.btnNum6Id:
                case R.id.btnNum7Id:
                case R.id.btnNum8Id:
                case R.id.btnNum9Id:
                    String inDigit = ((Button) view).getText().toString();
                    if (inStr.equals("0")) {
                        inStr = inDigit; // no leading zero
                    } else {
                        inStr += inDigit; // accumulate input digit
                    }
                    txtResult.setText(inStr);
// Clear buffer if last operator is '='
                    if (lastOperator == '=') {
                        result = 0;
                        lastOperator = ' ';
                    }
                    break;
// Operator buttons: '+', '-', '*', '/' and '='
                case R.id.btnAddId:
                    compute();
                    lastOperator = '+';
                    break;
                case R.id.btnSubId:
                    compute();
                    lastOperator = '-';
                    break;
                case R.id.btnMulId:
                    compute();
                    lastOperator = '*';
                    break;
                case R.id.btnDivId:
                    compute();
                    lastOperator = '/';
                    break;
                case R.id.btnEqualId:
                    compute();
                    lastOperator = '=';
                    break;
// Clear button
                case R.id.btnClearId:
                    result = 0;
                    inStr = "0";
                    lastOperator = ' ';
                    txtResult.setText("0");
                    break;
            }
        }
// User pushes '+', '-', '*', '/' or '=' button.
// Perform computation on the previous result and the current input number,
        // based on the previous operator.
        private void compute(){
            int inNum = Integer.parseInt(inStr);
            inStr = "0";
            if (lastOperator == ' ') {
                result = inNum;
            } else if (lastOperator == '+') {
                result += inNum;
            } else if (lastOperator == '-') {
                result -= inNum;
            } else if (lastOperator == '*') {
                result *= inNum;
            } else if (lastOperator == '/') {
                result /= inNum;
            } else if (lastOperator == '=') {
// Keep the result for the next operation
            }
            txtResult.setText(String.valueOf(result));
        }
    }
}
