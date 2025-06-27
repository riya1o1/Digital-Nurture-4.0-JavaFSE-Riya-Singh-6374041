package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

    MainCalculator calc = new MainCalculator();

    @Test
    public void testAdd() {
        int result = calc.add(2, 3);
        System.out.println("Testing add(2, 3): Expected = 5, Actual = " + result);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(4, 3);
        System.out.println("Testing subtract(4, 3): Expected = 1, Actual = " + result);
        assertEquals(1, result);
    }

    @Test
    public void testMultiply() {
        int result = calc.multiply(2, 3);
        System.out.println("Testing multiply(2, 3): Expected = 6, Actual = " + result);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        int result = calc.divide(6, 3);
        System.out.println("Testing divide(6, 3): Expected = 2, Actual = " + result);
        assertEquals(2, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        System.out.println("Testing divide(10, 0): Expect ArithmeticException");
        calc.divide(10, 0);
    }
}

