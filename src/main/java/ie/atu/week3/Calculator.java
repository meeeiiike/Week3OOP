package ie.atu.week3;

import java.util.Scanner;

public class Calculator {

    /**
     *
     *  Creating Add Method using Math Class
     *  and Printing to Screen
     */
    public static void add(int firstNum, int secondNum) {
        int sum = Math.addExact(firstNum, secondNum);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        /*
         *  | Main Method |
         * Prompt user for two numbers and
         * an operation to perform. These include:
         * add, subtract, multiply, divide or exponential
         */
        System.out.println("please enter the first number");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("please enter the second number");
        int secondNum = sc.nextInt();
        System.out.println("please enter the operation");
        String operation = sc.next();

        /*
         * switch statement for all operation methods
         */
        switch (operation) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "subtract":
                add(firstNum, secondNum);
                break;
            case "multiply":
                add(firstNum, secondNum);
                break;
            case "divide":
                add(firstNum, secondNum);
                break;
            case "exp":
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}

