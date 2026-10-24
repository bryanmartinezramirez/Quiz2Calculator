package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 3;
        int actual = calculator.sum(1, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumNegative() {
        int expected = -7;
        int actual = calculator.sum(-3, -4);

        assertEquals(expected, actual);
    }

    @Test
    public void testSumZero() {
        int expected = 0;
        int actual = calculator.sum(0, 0);

        assertEquals(expected, actual);
    }


    @Test
    public void testSubtract() {
        int expected = 5;
        int actual = calculator.subtract(8, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractFromNegative() {
        int expected = -7;
        int actual = calculator.subtract(-4, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtractNegative() {
        int expected = 7;
        int actual = calculator.subtract(4, -3);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 12;
        int actual = calculator.multiply(3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyNegative() {
        int expected = -12;
        int actual = calculator.multiply(-3, 4);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiplyZero() {
        int expected = 0;
        int actual = calculator.multiply(7, 0);

        assertEquals(expected, actual);
    }


    @Test
    public void testDivide() {
        int expected = 4;
        int actual = calculator.divide(12, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideRemainder() {
        int expected = 3;
        int actual = calculator.divide(7, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideNegative() {
        int expected = -3;
        int actual = calculator.divide(-7, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideNegativeDivisor() {
        int expected = -3;
        int actual = calculator.divide(7, -2);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideZeroNumerator() {
        int expected = 0;
        int actual = calculator.divide(0, 5);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(5, 0)
        );
    }

}
