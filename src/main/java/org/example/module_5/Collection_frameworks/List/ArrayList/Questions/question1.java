package lords_college_java_training.src.main.java.org.example.module_5.Collection_frameworks.List.ArrayList.Questions;
import java.util.ArrayList;
public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(10);
        input.add(30);
        input.add(20);
        ArrayList<Integer> output = new ArrayList<>();

        // logic
        for(int i = 0; i<input.size(); i++) {
            if (output.contains(input.get(i))==false) {
                output.add(input.get(i));
            }
        }
        System.out.println("After removing duplicates:"+output);
    }
}