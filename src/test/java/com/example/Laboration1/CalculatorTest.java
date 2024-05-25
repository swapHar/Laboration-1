package com.example.Laboration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void beforeTests(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding two positive numbers returns sum")
    public void testAddPositiveNumbers() {

        int a = 5;
        int b = 3;
        int expectedResult = 8;

        int result = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Adding two negative numbers returns sum")
    public void testAddNegativeNumbers() {

        int a = -5;
        int b = -3;
        int expectedResult = -8;

        int result = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Adding 5 and 3 should not return 7")
    public void testAddPositiveNumbersReturnsSum() {

        int a = 5;
        int b = 3;
        int expectedResult = 7;

        int result = calculator.add(a, b);

        Assertions.assertNotEquals(expectedResult, result);
    }


    @Test
    @DisplayName("Subtracting two positive numbers should return correct positive value")
    public void testSubtractPositiveNumbers() {

        int a = 10;
        int b = 7;
        int expectedResult = 3;

        int result = calculator.subtract(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtracting two negative numbers should return correct negative value")
    public void testSubtractNegativeNumbers() {

        int a = -10;
        int b = -7;
        int expectedResult = -3;

        int result = calculator.subtract(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtracting positive number number from 0 should return Negative number")
    public void testSubtractPositiveNumberFromZero() {

        int a = 0;
        int b = 7;
        int expectedResult = -7;

        int result = calculator.subtract(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying two positive numbers returns correct value")
    public void testMultiplyPositiveNumbers() {

        int a = 5;
        int b = 3;
        int expectedResult = 15;

        int result = calculator.multiply(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying two negative numbers should return correct value")
    public void testMultiplyNegativeNumbers() {

        int a = -5;
        int b = -5;
        int expectedResult = 25;

        int result = calculator.multiply(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying a positive number by Zero should return 0")
    public void testMultiplyNumbersByZero() {

        int a = 8;
        int b = 0;
        int expectedResult = 0;

        int result = calculator.multiply(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying two positive numbers should not return Zero")
    public void testMultiplyNumbersNotEqualToZero() {

        int a = 5;
        int b = 3;
        int expectedResult = 0;

        int result = calculator.multiply(a, b);

        Assertions.assertNotEquals(expectedResult, result);

    }

    @Test
    @DisplayName("Dividing two positive numbers should return correct value")
    public void testDividePositiveNumbers() {

        int a = 25;
        int b = 5;
        double expectedResult = 5.0;

        double result = calculator.divide(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("SquareRootOf method should return correct value")
    public void testSquareRootOfNumber() {

        int a = 25;

        double expectedResult = 5.0;

        double result = calculator.squareRootOf(a);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("If positive number is passed getArea method should return correct value")
    public void testGetAreaPositiveNumber() {

        int a = 10;

        double expectedResult = 314.16;

        double result = calculator.getArea(a);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("If negative number is passed getArea method should return Double.NaN")
    public void testGetAreaNegativeNumber() {

        int a = -10;

        double result = calculator.squareRootOf(a);

        Assertions.assertTrue(Double.isNaN(result));
    }

}
