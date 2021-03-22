package com.giacomini.calculator.core;

public class CalculatorImpl implements Calculator {
    @Override
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }
}
