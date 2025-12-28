package lords_college_java_training.src.main.java.org.example.module_5.List.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistSorting {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>(Arrays.asList(30, 10, 60, 5, 100, 0));

        obj.sort(null);

        System.out.println("Ascending order");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();

        obj.sort(Collections.reverseOrder());
        System.out.println("Descending order");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();

        Collections.sort(obj);
        System.out.println("loop 3");
        for(Integer ele: obj) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
