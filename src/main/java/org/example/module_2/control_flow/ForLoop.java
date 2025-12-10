package lords_college_java_training.src.main.java.org.example.module_2.control_flow;

public class ForLoop {
    public static void main(String[] args) {
        for (int i=1;i<=3;i++) {
            System.out.println("iteration: "+i);
        }
        int[] numbers={2,4,6,8};
        System.out.println("length of array: "+numbers.length);
        for (int i=0;i<numbers.length;i++) {
            System.out.println("number: "+numbers[i]);
        }
        String[] fruits={"apple","kiwi","mango"};
        //this loop is enhanced form when we need only value not index
        System.out.println("Enhanced for loop");
        for(String fruit:fruits){
            System.out.println("fruit: "+fruit);
        }
        System.out.println("normal for loop");
        for(int i=0; i<fruits.length; i++) {
            System.out.println("Fruit: " + fruits[i]);
        }
    }
}
