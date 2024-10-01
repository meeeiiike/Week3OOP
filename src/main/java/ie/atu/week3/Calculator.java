package ie.atu.week3;

import java.util.Scanner;

public class Calculator {

    /**
     *  Creating Add Method
     * 
     *
     */
    public static void add(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println("please enter the first number");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("please enter the second number");
        int secondNum = sc.nextInt();
        System.out.println("please enter the operation");
        String operation = sc.next();
        switch (operation) {
            case "add":
                add(firstNum, secondNum);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}

