package lords_college_java_training.src.main.java.org.example.module_3.Inheritance.example1;

public class CurrentAccount extends Bankaccount {
    //attributes
    public double interestRate=2.5;

    //methods
    public void applyInterest(){
        double interest=balance*(interestRate/100);
        deposit(interest);
    }
}
