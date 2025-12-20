package lords_college_java_training.src.main.java.org.example.module_4.Errors;

public class LogicalError {
    public static void main(String[] args) {
        System.out.println(add(20,5));
    }
    public static int add(int a,int b){
        return a-b;
    }
}
