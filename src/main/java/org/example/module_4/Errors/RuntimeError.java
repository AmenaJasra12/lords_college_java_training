package lords_college_java_training.src.main.java.org.example.module_4.Errors;

public class RuntimeError {
    public static void main(String[] args) {
            int a=10/0;
            System.out.println("The value of a is: "+a);

            int[] array={1,2,3};
            System.out.println(array[5]);
    }
}
