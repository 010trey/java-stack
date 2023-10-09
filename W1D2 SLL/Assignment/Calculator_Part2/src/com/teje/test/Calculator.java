package com.teje.test;

import java.util.Stack;

public class Calculator {
    private double result;
    private Stack<Double> operandStack;
    private Stack<Character> operatorStack;

    public Calculator() {
        result = 0;
        operandStack = new Stack<>();
        operatorStack = new Stack<>();
    }

    public void performOperation(double operand) {
        operandStack.push(operand);
    }

    public void performOperation(char operator) {
        while (!operatorStack.isEmpty() && hasPrecedence(operator, operatorStack.peek())) {
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            char op = operatorStack.pop();
            double calculatedResult = calculate(operand1, operand2, op);
            operandStack.push(calculatedResult);
        }
        operatorStack.push(operator);
    }

    public void performEquals() {
        while (!operatorStack.isEmpty()) {
            double operand2 = operandStack.pop();
            double operand1 = operandStack.pop();
            char op = operatorStack.pop();
            double calculatedResult = calculate(operand1, operand2, op);
            operandStack.push(calculatedResult);
        }
        if (!operandStack.isEmpty()) {
            result = operandStack.pop();
        }
    }

    public double getResults() {
        return result;
    }

    private boolean hasPrecedence(char op1, char op2) {
        return (op2 != '(' && op2 != ')') && (getPrecedence(op1) <= getPrecedence(op2));
    }

    private int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return 0;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.performOperation(10.5);
        calculator.performOperation('+');
        calculator.performOperation(5.2);
        calculator.performOperation('*');
        calculator.performOperation(10);
        calculator.performEquals();

        System.out.println("Result: " + calculator.getResults()); // Output should be 62.5
    }
}

