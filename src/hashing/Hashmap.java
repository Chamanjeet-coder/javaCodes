package hashing;

import java.util.*;
import java.util.Map;

class Pair{
    int num;
}

public class Hashmap {
    public static void main(String[] args) {
//        [] arr = new int[;
        HashMap i= new HashMap<>();
        i.put(1,new Pair());
        i.put(2,"gssja");
        i.put(3,"jhesemn");
        System.out.println(i.containsKey(1));
        System.out.println(i.containsValue("gssja"));
        System.out.println( i.get(1));
        System.out.println( i.get(2));
        Set keys = i.keySet();
        for(Object key : keys){
            System.out.println(i.get(key));
        }

        // HashMap --> HashMap<Object,Object>
        // HashMap<Integer,Integer>
//        for (Map.Entry<Integer, String> entry : i.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
    }

}
