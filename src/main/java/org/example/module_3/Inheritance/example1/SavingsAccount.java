package org.example.module_3.Inheritance.example1;

public class SavingsAccount extends Bankaccount {
    //attributes
    public double interestRate=4.5;

    //methods
    public void applyInterest(){
        double interest=balance*(interestRate/100);
        deposit(interest);
    }
}
