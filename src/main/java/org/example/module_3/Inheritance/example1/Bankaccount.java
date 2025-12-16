package lords_college_java_training.src.main.java.org.example.module_3.Inheritance.example1;

public class Bankaccount {
    //attribute
    public double balance;
    //methods
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
