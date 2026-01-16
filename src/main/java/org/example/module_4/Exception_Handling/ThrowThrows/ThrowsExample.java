package org.example.module_4.Exception_Handling.ThrowThrows;

public class ThrowsExample {
    public static void main(String[] args) {
        System.out.println("Program Started");
        try {
            myMethod();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
        System.out.println("Program Ended");
    }
    static void myMethod() throws ArithmeticException{
        int a=10/2;
    }
}
