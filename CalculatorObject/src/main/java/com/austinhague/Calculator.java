package com.austinhague;
// I did this with my group members but don't remember who they were
public class Calculator {
    int holderI;
    double holderD;

    public int add(int a, int b) {
        holderI = a + b;
        System.out.println("Addition of integers " + a + " and " + b + " equals " + holderI + ".");
        return holderI;
    }

    public int subtract(int a, int b) {
        holderI = a - b;
        System.out.println("Subtraction of integers " + a + " minus " + b + " equals " + holderI + ".");
        return holderI;
    }

    public int multiply(int a, int b) {
        holderI = a * b;
        System.out.println("Multiplication of integers " + a + " times " + b + " equals " + holderI + ".");
        return holderI;
    }

    public int divide(int a, int b) {
        if (a != 0 && b != 0) {
            holderI = a / b;
            System.out.println("Division of integers " + a + " divided by " + b + " equals " + holderI + ".");
            return holderI;
        }
        System.out.println("Cannot divide " + a + "  by " + b + " because one or both intergers are  " + 0 + ".");
        return 0;
    }

    public double add(double a, double b) {
        holderD = a + b;
        System.out.println("Addition of doubles " + a + " and " + b + " equals " + holderD + ".");
        return holderD;
    }

    public double subtract(double a, double b) {
        holderD = a - b;
        System.out.println("Subtraction of doubles " + a + " minus " + b + " equals " + holderD + ".");
        return holderD;
    }

    public double multiply(double a, double b) {
        holderD = a * b;
        System.out.println("Multiplication of doubles " + a + " times " + b + " equals " + holderD + ".");
        return holderD;
    }

    public double divide(double a, double b) {
        if (a != 0 && b != 0) {
            holderD = a / b;
            System.out.println("Division of doubles " + a + " diveded by  " + b + " equals " + holderD + ".");
            return holderD;
        }
        System.out.println("Cannot divide " + a + "  by " + b + " because one or both intergers are  " + 0 + ".");
        return 0.00;
    }
    public static void main(String[] args) {
        // Instantiate Objects
        Calculator myCalc = new Calculator();
        // Execute Methods for Calculator
        myCalc.add(1,1);
        myCalc.subtract(23,52);
        myCalc.multiply(32,2);
        myCalc.divide(8,0);
        myCalc.divide(12,7);
        myCalc.add(3.4,2.3);
        myCalc.multiply(6.7,4.4);
        myCalc.subtract(5.5,0.5);
        myCalc.divide(10.8,2.2);
    }
}