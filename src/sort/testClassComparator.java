package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//class  point implements Comparable<point>{
//    int x;
//    int y;
//    point(int x,int y){
//        this.x=x;
//        this.y=y;
//    }
//    public int compareTo(point j){
//        return this.x- j.x;
//    }
//}
class  point{
    int x;
    int y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
//class myCmp implements Comparator<point> {
//
//    public int compare(point o,point k) {
//        return o.x-k.x;
//    }
//}

public class testClassComparator {


    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        point[] arr=new point[n];
        for(int i=0;i<n;i++){
            arr[i]=new point(in.nextInt(), in.nextInt()) ;
        }
        Arrays.sort(arr,(i,j)-> i.x-j.y);
        for(int i=0;i<n;i++){
            System.out.println(arr[i].x +" "+ arr[i].y);
        }
    }
}
