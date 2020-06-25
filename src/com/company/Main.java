package com.company;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to my basic calculator program! Press any key. ");
        scanner.nextLine();

        System.out.println("Enter first digit: ");
        if (scanner.hasNextInt()) {
            int firstDigit = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter second digit: ");
            if(scanner.hasNextInt()) {

                int secondDigit = scanner.nextInt();
                scanner.nextLine();

                int theoperation = operation(firstDigit,secondDigit);

            } else{
                System.out.println("Invalid input!");
            }

        } else {
            System.out.println("Invalid input!");
        }


    }
    public static int operation (int num1, int num2) {
        int answer;
        System.out.println("Enter desired operation from +, -, /, x");
        String operation = scanner.nextLine();
        switch (operation) {
            case "-":
                answer = num1 - num2;
                System.out.println("The difference is " + answer);
                return answer;
            case "+":
                answer = num1 + num2;
                System.out.println("The sum is " + answer);
                return  answer;
            case "/":
                answer = num1/num2;
                System.out.println("The quotient is " + answer);
                return answer;
            case "x":
                answer = num1 * num2;
                System.out.println("The product is " + answer);
                return  answer;
            default:
                System.out.println("Invalid input!");
                return  -1;
        }

    }
}
