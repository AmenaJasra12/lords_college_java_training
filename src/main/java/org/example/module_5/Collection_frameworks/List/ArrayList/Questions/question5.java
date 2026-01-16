package org.example.module_5.Collection_frameworks.List.ArrayList.Questions;
import java.util.ArrayList;
public class question5 {
    public static void main(String[] args) {
        ArrayList<Integer> input4 =new ArrayList<>();
        input4.add(1);
        input4.add(2);
        input4.add(3);
        input4.add(4);
        input4.add(5);
        input4.add(6);
        for (int i = 0; i < input4.size(); i++) {
            if (input4.get(i) % 2 == 0) {
                input4.remove(i);
                i--;
            }
        }
        System.out.println(input4);
    }
}
