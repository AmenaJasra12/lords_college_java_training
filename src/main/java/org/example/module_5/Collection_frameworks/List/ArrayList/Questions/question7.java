package org.example.module_5.Collection_frameworks.List.ArrayList.Questions;
import java.util.ArrayList;

public class question7 {
    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        //ArrayList<Integer> input=new ArrayList<>(Arrays.asList(4,5,1,2,1,4);
        input.add(4);
        input.add(5);
        input.add(1);
        input.add(2);
        input.add(1);
        input.add(4);

        int result=0;
        //finding first element that does not repeat
        for(int i=0;i<input.size();i++) {
            Integer ele = input.get(i);
            int j = i + 1;

            for (;j<input.size();j++){
                Integer nextEle = input.get(j);
                if (ele==nextEle) {
                    break;
                }
            }
            if(j==input.size()) {
                result=ele;
                break;
            }
        }
        System.out.println("Result: "+result);
    }
}
