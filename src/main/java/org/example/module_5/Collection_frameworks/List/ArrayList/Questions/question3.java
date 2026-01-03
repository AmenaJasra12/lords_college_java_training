package lords_college_java_training.src.main.java.org.example.module_5.Collection_frameworks.List.ArrayList.Questions;
import java.util.ArrayList;
public class question3 {
    public static void main(String[] args) {
        ArrayList<String> input2 = new ArrayList<>();
        input2.add("Java");
        input2.add("Spring");
        input2.add("SQL");

        ArrayList<String> output = new ArrayList<>();

        // logic
        int i = input2.size()-1;
        while(i>=0){
            output.add(input2.get(i));
            i--;
        }
        System.out.println(output);

    }
}
