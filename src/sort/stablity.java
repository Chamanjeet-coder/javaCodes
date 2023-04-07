package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class student implements Comparable<student>{
    String name;
    int marks;
    student(int x, String k){
        marks=x;
        name=k;
    }
    public int compareTo(student i){
        if(this.marks==i.marks){
            return this.name.compareTo(i.name);
        }
        return this.marks-i.marks;
    }
}
public class stablity {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<student> arr = new ArrayList<>();
        for (int i=0;i<n;i++){
            arr.add(new student(in.nextInt(), in.next()));
        }
        in.close();
        Collections.sort(arr);
        for (int i=0;i<n;i++){
            System.out.println(arr.get(i).name+ " "+ arr.get(i).marks);
        }


    }
}
