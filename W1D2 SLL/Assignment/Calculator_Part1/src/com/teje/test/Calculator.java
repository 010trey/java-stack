package com.teje.test;

public class Calculator {
    private double operandOne;
    private double operandTwo;
    private String operation;
    
    public Calculator() {
        // Initialize the calculator with default values
        this.operandOne = 0;
        this.operandTwo = 0;
        this.operation = "";
    }
    
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }
    
    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }
    
    public void setOperation(String operation) {
        // Check if the operation is valid (only allow addition or subtraction)
        if (operation.equals("+") || operation.equals("-")) {
            this.operation = operation;
        } else {
            System.out.println("Invalid operation. Only '+' and '-' are supported.");
        }
    }
    
    public void performOperation() {
        double result = 0;
        
        if (operation.equals("+")) {
            result = operandOne + operandTwo;
        } else if (operation.equals("-")) {
            result = operandOne - operandTwo;
        }
        
        // Store the result in operandOne for future calculations
        operandOne = result;
    }
    
    public double getResults() {
        return operandOne;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        calculator.setOperandOne(10.5);
        calculator.setOperation("+");
        calculator.setOperandTwo(5.2);
        calculator.performOperation();
        
        System.out.println("Result: " + calculator.getResults()); // Output should be 15.7
    }
}

