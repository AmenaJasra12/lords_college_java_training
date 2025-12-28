package lords_college_java_training.src.main.java.org.example.module_5.List.LinkedList;

import java.util.LinkedList;

public class ll1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Chandler");
        ll.add("joey");
        ll.add("charles");
        ll.add("syla");

        System.out.println(ll.get(2));

        System.out.println("Before remove 2nd indx: " + ll.get(2));
        ll.remove(2);
        System.out.println("After remove 2nd indx: " + ll.get(2));

        System.out.println(ll.size());

        System.out.println(ll.contains("Xyz"));
        System.out.println(ll.contains("syla"));
        System.out.println(ll.indexOf("syla"));
        System.out.println(ll.indexOf("Xyzzzzz"));

        String[] arr = ll.toArray(new String[0]);
        System.out.println("first element of arr: " + arr[1]);
    }
}
