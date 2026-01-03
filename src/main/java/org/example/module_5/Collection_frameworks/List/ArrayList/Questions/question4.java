package lords_college_java_training.src.main.java.org.example.module_5.Collection_frameworks.List.ArrayList.Questions;
import java.util.ArrayList;

public class question4 {
    public static void main(String args[]){
        ArrayList<String> input3 =new ArrayList<>();
        input3.add("apple");
        input3.add("banana");
        input3.add("apple");
        input3.add("orange");
        input3.add("banana");
        ArrayList<String> elements = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (String item : input3) {
            if (elements.contains(item)) {
                int index = elements.indexOf(item);
                count.set(index, count.get(index) + 1);
            } else {
                elements.add(item);
                count.add(1);
            }
        }

        // Display result
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i) + " -> " + count.get(i));
        }
    }
}
