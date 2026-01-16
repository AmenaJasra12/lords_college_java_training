package org.example.module_3.Inheritance.example1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        obj.deposit(5000);
        obj.printBalance();
        obj.applyInterest();
        obj.printBalance();

        CurrentAccount obj2 = new CurrentAccount();
        obj2.deposit(8000);
        obj2.printBalance();
        obj2.applyInterest();
        obj2.printBalance();
    }
}
