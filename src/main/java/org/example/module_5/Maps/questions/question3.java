package lords_college_java_training.src.main.java.org.example.module_5.Maps.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,7,11,15));
        int target=9;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=target;
        for(int i=0;i<arr.size();i++){
            int a=arr.get(i);
            int b=c-a;
            if(hm.containsKey(a)==false){
                hm.put(b,i);
            }else{
                System.out.println("["+hm.get(a)+","+i+"]");
                break;
            }
            System.out.println("Current a: "+a+", b: "+b+", hm:"+hm);
        }
    }
}
