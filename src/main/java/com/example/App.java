package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double firstNum;
        double secondNum;

        System.out.println("Thanks for using our Calculator!");

        // Keep asking for numbers until the user stops the application
        do {
            // use try-catch to avoid InputMismatch Exception stops the application
            
                // Obtain numbers
                System.out.println("Please enter the first number or press ctrl + c to quit: ");
                checkInputValid(scanner);
                firstNum = scanner.nextDouble();

                System.out.println("Please enter the second number or press ctrl + c to quit: ");
                checkInputValid(scanner);
                secondNum = scanner.nextDouble();

                System.out.printf("The sum of two numbers you entered is: %f\n", sum(firstNum, secondNum));
            
        } while (true);
    }

    // Method that calculate the sum of two numbers, uses double type and return double type
    public static double sum(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public static void checkInputValid(Scanner scanner){
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            // Consume the invalid input to prevent an infinite loop
            scanner.next();
        }
    }
}

