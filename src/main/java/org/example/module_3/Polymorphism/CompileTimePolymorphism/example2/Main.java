package org.example.module_3.Polymorphism.CompileTimePolymorphism.example2;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a=10;
        int b=10;
        System.out.println(calc.add(a,b));

        double c=10,d=20;
        System.out.println(calc.add(c,d));

        float e=10.0f,f=20.0f;
        System.out.println(calc.add(e,f));
    }
    // we can write main class here as well instead of seperate file

}
