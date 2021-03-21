package com.giacomini.calculator;

import com.giacomini.calculator.core.Calculator;
import com.giacomini.calculator.core.CalculatorImpl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator calculator;
    private final double differenceSupported;

    public ExampleUnitTest() {
        this.calculator = new CalculatorImpl();
        this.differenceSupported = 0.001;
    }

    @Test
    public void test_sum_isCorrect() {
        assertEquals(0F, this.calculator.sum(1, -1), this.differenceSupported);
        assertEquals(4F, this.calculator.sum(2, 2), this.differenceSupported);
        assertEquals(-6F, this.calculator.sum(-3, -3), this.differenceSupported);
    }
}