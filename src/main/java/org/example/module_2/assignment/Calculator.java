package org.example.module_2.assignment;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continueCalculation = true;

        while(continueCalculation){
            System.out.println("Choose your operation: +, -, *, /");
            String userChoice = sc.next();
            System.out.println("Enter your first number:");
            double firstNumber = sc.nextDouble();
            System.out.println("Enter your second number:");
            double secondNumber = sc.nextDouble();

            double result = 0;
            switch (userChoice) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    if(secondNumber == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        break;
                    }
                    System.out.println("Performing integer division.");
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Invalid operation selected.");
            }
            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String userResponse = sc.next();
            if(userResponse.equals("yes")) {
                continueCalculation = true;
            } else {
                continueCalculation = false;
            }
        }
    }
}
