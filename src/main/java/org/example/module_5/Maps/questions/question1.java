package lords_college_java_training.src.main.java.org.example.module_5.Maps.questions;
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,2,3,1,4));
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer ele:arr){
            if(hm.containsKey(ele)==false){
                hm.put(ele,1);
            }else{
                int previousCount=hm.get(ele);
                hm.put(ele,previousCount+1);
            }
        }
        System.out.println("Frequency map: "+hm);
        Set<Map.Entry<Integer,Integer>> entries=hm.entrySet();
        for(Map.Entry<Integer,Integer> pair:entries){
            System.out.print(pair.getKey()+"="+pair.getValue()+", ");
        }
    }
}
