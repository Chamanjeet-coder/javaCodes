package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> obj= new HashSet<String>();
        obj.add("abc");
        obj.add("wed");
        obj.add("abc");
        System.out.println(obj.contains("abc"));
        System.out.println(obj.size());

//        Iterator i=obj.iterator();
        for (String i:obj) {
            System.out.println(i);
            System.out.println("The size is:- "+obj.size());

        }
        System.out.println("The size is:- "+obj.size());
        //System.out.println(obj);
    }
}
