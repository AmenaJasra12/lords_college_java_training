package org.example.module_3.Polymorphism.CompileTimePolymorphism.example2;

public class Calculator {
    public int add(int a,int b){
        System.out.println("add method with int type called");
        return a+b;
    }
    public double add(double a,double b){
        System.out.println("add method with double type called");
        return a+b;
    }
    public float add(float a,float b){
        System.out.println("add method with float type called");
        return a+b;
    }
}
