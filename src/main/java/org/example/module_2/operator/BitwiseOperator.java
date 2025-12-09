package lords_college_java_training.src.main.java.org.example.module_2.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Bitwise AND operator (&)
        System.out.println("a & b: " + (a & b));

        // Bitwise OR operator (|)
        System.out.println("a | b: " + (a | b));

        // Bitwise XOR operator (^)
        System.out.println("a ^ b: " + (a ^ b));

        // Bitwise NOT operator (~)
        System.out.println("~a: " + (~a));

        // Bitwise Left Shift operator (<<)
        System.out.println("a << 1: " + (a << 1));

        // Bitwise right shift operator
        System.out.println("a >> 1: " + (a >> 1));
    }
}
