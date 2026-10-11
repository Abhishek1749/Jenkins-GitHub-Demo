package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(10, 20));
    }
}