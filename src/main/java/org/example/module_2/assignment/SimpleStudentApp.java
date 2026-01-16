package org.example.module_2.assignment;
import java.util.Scanner;
public class SimpleStudentApp {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name=obj.nextLine();
        System.out.println("Enter Student Gender:");
        String gender=obj.nextLine();
        System.out.println("Enter Student Age:");
        int age=obj.nextInt();
        System.out.println("Enter your height: ");
        double height = obj.nextDouble();
        System.out.println("Enter your weight: ");
        float weight = obj.nextFloat();
        System.out.println("Enter your gpa: ");
        double gpa = obj.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi);

        String result = gpa >= 2.5 ? "Pass" : "Fail";
        System.out.println("Result " + result);

    }
}
