package lords_college_java_training.src.main.java.org.example.module_5.Collection_frameworks.List.ArrayList.Questions;

import java.util.ArrayList;
public class question2 {
    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList<>();
        input1.add(4);
        input1.add(9);
        input1.add(1);
        input1.add(7);
        input1.add(9);

        Integer max_num=Integer.MIN_VALUE;
        Integer second_largest=Integer.MIN_VALUE;
        // logic
        for(int ele: input1) {
            if (ele>max_num) {
                second_largest=max_num;
                max_num=ele;
            }
            else if (ele>second_largest && ele<max_num) {
                second_largest=ele;
            }
        }
        System.out.println(second_largest);
    }
}
