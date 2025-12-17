package lords_college_java_training.src.main.java.org.example.module_3.Abstraction.Interfaces.example2;

public class CreditCardPayment extends Bank implements PaymentsystemInterface {
    public void pay(int amount){
        balance-= amount;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void showBalance(){
        System.out.println("Balance: "+balance);
    }
}
