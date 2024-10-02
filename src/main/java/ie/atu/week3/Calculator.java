package ie.atu.week3;

import java.util.Objects;
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
        double exp = Math.pow(firstNum, secondNum);
        System.out.println("Answer: " + exp);
    }

    /**
     *  | Main Method |
     * Prompt user for two numbers.
     * Then prompt an operation to perform. These include:
     * Add, subtract, multiply, divide and exponential of two numbers
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("please enter first number");
            int firstNum = sc.nextInt();
            System.out.println("please enter second number");
            int secondNum = sc.nextInt();
            System.out.println("please enter the operation");
            String operation = sc.next();

            /*
             * switch statement to call operation methods
             */
            switch (operation) {
                case "add":
                    add(firstNum, secondNum);
                    break;
                case "subtract":
                    subtract(firstNum, secondNum);
                    break;
                case "multiply":
                    multiply(firstNum, secondNum);
                    break;
                case "divide":
                    if (secondNum <= 0) {
                        System.out.println("Invalid! Number must be greater than 0");
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
            System.out.println("\nType 'quit' to exit\nAny key to Continue\n");
        } while (!Objects.equals(sc.next(), "quit"));
        System.out.println("Goodbye!");
    }
}