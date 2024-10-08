package ie.atu.week3;

import java.util.Scanner;

public class Calculator {

    /*
     *  Methods used for calculator operations
     */
    public static void add(int firstNum, int secondNum) {
        int sum = Math.addExact(firstNum, secondNum);
        System.out.println("Answer: " + sum);
    }

    public static void subtract(int firstNum, int secondNum) {
        int sum = Math.subtractExact(firstNum, secondNum);
        System.out.println("Answer: " + sum);
    }

    public static void multiply(int firstNum, int secondNum) {
        int sum = Math.multiplyExact(firstNum, secondNum);
        System.out.println("Answer: " + sum);
    }

    public static void divide(int firstNum, int secondNum) {
        double sum = (double) firstNum / secondNum;
        System.out.println("Answer: " + sum);
    }

    public static void exp(int firstNum, int secondNum) {
        double sum = Math.pow(firstNum, secondNum);
        System.out.println("Answer: " + sum);
    }

    /**
     *  | Main Method |
     * Prompt user for two numbers.
     * Then prompt an operation to perform. These include:
     * Add, subtract, multiply, divide and exponential of two numbers
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n   Please enter the operation:\n  +, -, *, / or q to quit");
            String operation = sc.next();

            /*
             * Logic for user quitting program
             */
            if (operation.equals("q") || operation.equals("Q")) {
                System.out.println("Goodbye!");
                break; // break will exit both loops!!! very noice
            }

            System.out.println("\nplease enter first number");
            int firstNum = sc.nextInt();
            System.out.println("please enter second number");
            int secondNum = sc.nextInt();
            /*
             * Switch statement to call operation methods
             */
            switch (operation) {
                case "+":
                    add(firstNum, secondNum);
                    break;
                case "-":
                    subtract(firstNum, secondNum);
                    break;
                case "*":
                    multiply(firstNum, secondNum);
                    break;
                case "/":
                    if (secondNum <= 0) {
                        System.out.println("Invalid! Number must be greater than 0");
                        continue; // continue is used to restart loop!!! noice
                    } else {
                        divide(firstNum, secondNum);
                    }
                    break;
                case "exp":
                    exp(firstNum, secondNum);
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
}