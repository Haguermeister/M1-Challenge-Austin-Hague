package com.austinhague;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator myCalc;

    @Before
    public void setup() {
        myCalc = new Calculator();
    }
    @Test
    public void shouldMultiplyPositiveInts() {
        // Arrange
        int expected = 68;
        // Act
        int result = myCalc.multiply(34, 2);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldMultiplyNegativeInts() {
        // Arrange
        int expected = 27;
        // Act
        int result = myCalc.multiply(-9, -3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeInts() {
        // Arrange
        int expected = -27;
        // Act
        int result = myCalc.multiply(-9, 3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnZeroIfIntsEqualsZeroMultiply() {
        // Arrange
        int expected = 0;
        // Act
        int result = myCalc.multiply(0, 3);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void shouldDividePositiveInts() {
        // Arrange
        int expected = 4;
        // Act
        int result = myCalc.divide(12, 3);
        // Assert
        assertEquals(expected, result);
        int expected2= 1;
        // Act
        int result2 = myCalc.divide(12, 7);
        // Assert
        assertEquals(expected2, result2);
    }

    @Test
    public void shouldDivideNegativeInts() {
        // Arrange
        int expected = 3;
        // Act
        int result = myCalc.divide(-9, -3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldDividePositiveAndNegativeInts() {
        // Arrange
        int expected = -3;
        // Act
        int result = myCalc.divide(-9, 3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnZeroIfIntsEqualsZeroDivide() {
        // Arrange
        int expected = 0;
        // Act
        int result = myCalc.divide(0, 3);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void shouldAddPositiveInts() {
        // Arrange
        int expected = 2;
        // Act
        int result = myCalc.add(1, 1);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldAddNegativeInts() {
        // Arrange
        int expected = -12;
        // Act
        int result = myCalc.add(-9, -3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldAddPositiveAndNegativeInts() {
        // Arrange
        int expected = -6;
        // Act
        int result = myCalc.add(-9, 3);
        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void shouldSubtractPositiveInts() {
        // Arrange
        int expected = -29;
        // Act
        int result = myCalc.subtract(23, 52);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldSubtractNegativeInts() {
        // Arrange
        int expected = -6;
        // Act
        int result = myCalc.subtract(-9, -3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldSubtractPositiveAndNegativeInts() {
        // Arrange
        int expected = -12;
        // Act
        int result = myCalc.subtract(-9, 3);
        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void shouldMultiplyPositiveDoubles() {
        // Arrange
        double expected = 29.48;
        double a = 6.7;
        double b = 4.4;
        // Act
        double result = myCalc.multiply(a, b);
        // Assert
        assertEquals(expected,result,.1);
    }

    @Test
    public void shouldMultiplyNegativeDoubles() {
        // Arrange
        double expected = 27.00;
        double a = -9.00;
        double b = -3.00;
        // Act
        double result = myCalc.multiply(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeDoubles() {
        // Arrange
        double expected = -27.00;
        double a = -9.00;
        double b = 3.00;
        // Act
        double result = myCalc.multiply(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldReturnZeroIfDoublesEqualsZeroMultiply() {
        // Arrange
        double expected = 0.00;
        double a = -9.00;
        double b = 0.00;
        // Act
        double result = myCalc.multiply(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }
    @Test
    public void shouldDividePositiveDoubles() {
        // Arrange
        double expected = 4.99;
        double a = 10.8;
        double b = 2.2;
        // Act
        double result = myCalc.divide(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldDivideNegativeDoubles() {
        // Arrange
        double expected = 3.00;
        double a = -9.00;
        double b = -3.00;
        // Act
        double result = myCalc.divide(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldDividePositiveAndNegativeDoubles() {
        // Arrange
        double expected = -3.00;
        double a = -9.00;
        double b = 3.00;
        // Act
        double result = myCalc.divide(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldReturnZeroIfDoublesEqualsZeroDivide() {
        // Arrange
        double expected = 0.00;
        double a = -9.00;
        double b = 0;
        // Act
        double result = myCalc.divide(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }
    @Test
    public void shouldAddPositiveDoubles() {
        // Arrange
        double expected = 5.7;
        double a = 3.4;
        double b = 2.3;
        // Act
        double result = myCalc.add(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldAddNegativeDoubles() {
        // Arrange
        double expected = -12;
        double a = -9.00;
        double b = -3.00;
        // Act
        double result = myCalc.add(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldAddPositiveAndNegativeDoubles() {
        // Arrange
        double expected = -6.00;
        double a = -9.00;
        double b = 3.00;
        // Act
        double result = myCalc.add(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }
    @Test
    public void shouldSubtractPositiveDoubles() {
        // Arrange
        double expected = 5.0;
        double a = 5.5;
        double b = .5;
        // Act
        double result = myCalc.subtract(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldSubtractNegativeDoubles() {
        // Arrange
        double expected = -6;
        double a = -9.00;
        double b = -3.00;
        // Act
        double result = myCalc.subtract(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

    @Test
    public void shouldSubtractPositiveAndNegativeDoubles() {
        // Arrange
        double expected = -12;
        double a = -9.00;
        double b = 3.00;
        // Act
        double result = myCalc.subtract(a, b);
        // Assert
        assertEquals(expected, result,.1);
    }

}