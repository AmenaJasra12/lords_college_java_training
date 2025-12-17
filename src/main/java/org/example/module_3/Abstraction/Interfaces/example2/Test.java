package lords_college_java_training.src.main.java.org.example.module_3.Abstraction.Interfaces.example2;

public class Test {
    public static void main(String[] args) {
        PaymentsystemInterface o1=new CreditCardPayment();
        o1.deposit(200);
        PaymentsystemInterface o2=new UpiPayment();
        o2.pay(30);

        o1.showBalance();
        o2.showBalance();
    }
}
