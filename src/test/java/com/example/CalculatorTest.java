package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
