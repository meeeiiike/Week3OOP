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

    /**
     *  KEEP ON BRANCH UNTIL VIDEO IS MADE
     */


    /*
     *  | Main Method |
     * Prompt user for two numbers and
     * an operation to perform. These include:
     * add, subtract, multiply, divide or exponential
     */
    public static void main(String[] args) {
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
                subtract(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "divide":
                if (secondNum<=0){
                    System.out.println("Invalid! Number must be greater than 0");
                } else {
                    divide(firstNum, secondNum);
                }
                break;

            /**
             *  KEEP ON BRANCH UNTIL VIDEO IS MADE
             */
            case "exp":
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}

