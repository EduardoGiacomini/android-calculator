package com.giacomini.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.giacomini.calculator.core.Calculator;
import com.giacomini.calculator.core.CalculatorImpl;

public class MainActivity extends AppCompatActivity {
    private Calculator calculator;

    private Button sumButton, subtractButton;
    private EditText number1TextField;
    private EditText number2TextField;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.calculator = new CalculatorImpl();

        this.sumButton = findViewById(R.id.sumButton);
        this.subtractButton = findViewById(R.id.subtractButton);
        this.number1TextField = findViewById(R.id.number1TextField);
        this.number2TextField = findViewById(R.id.number2TextField);
        this.resultTextView = findViewById(R.id.resultValue);

        this.sumButton.setOnClickListener(v -> {
            double number1 = this.getNumberFromTextView(this.number1TextField);
            double number2 = this.getNumberFromTextView(this.number2TextField);
            double sum = this.calculator.sum(number1, number2);
            this.setResultOnResultTextView(sum);
        });

        this.subtractButton.setOnClickListener(v -> {
            double number1 = this.getNumberFromTextView(this.number1TextField);
            double number2 = this.getNumberFromTextView(this.number2TextField);
            double subtract = this.calculator.subtract(number1, number2);
            this.setResultOnResultTextView(subtract);
        });
    }

    private double getNumberFromTextView(EditText textView) {
        return Double.parseDouble(textView.getText().toString());
    }

    private void setResultOnResultTextView(double result) {
        String parsedResult = Double.toString(result);
        this.resultTextView.setText(parsedResult);
    }
}