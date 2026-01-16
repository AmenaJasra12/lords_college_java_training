package org.example.module_5.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WaystoIterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"apple");
        hm.put(2,"banana");
        hm.put(3,"grapes");
        hm.put(2,"orange");

        System.out.println("for each loop on keys");
        ArrayList<Integer> arrayListOfKeys=new ArrayList<>(hm.keySet());
        for (Integer key: arrayListOfKeys){
            System.out.println("key:"+key+" value:"+hm.get(key));
        }
        System.out.println("for each loop on entries");
        Set<Map.Entry<Integer,String>>pairsList=hm.entrySet();
        for (Map.Entry<Integer,String> pair: pairsList){//read as well update the pair
            System.out.println("key:"+pair.getKey()+" value:"+pair.getValue());
            if(pair.getKey()==3){
                pair.setValue("kiwi");
            }
        }
        System.out.println("forEach method with lambda");
        hm.forEach((key,value)->{
            System.out.println("key:"+key+" value:"+value);
        });
    }
}
