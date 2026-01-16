package org.example.module_4.Exception_Handling.TryCatch;

public class BasicExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program started");
        int result=0;
        System.out.println("Dividing 10 by 0");

        try{
            result=10/2;
        }catch(Exception obj){
            System.out.println("An exception occurred");
            System.out.println(obj.getMessage());
        }finally{
            System.out.println("this block is always executed");
        }
        System.out.println("Printing result: "+result);
        System.out.println("Program ended");
    }
}
