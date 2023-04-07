package celling_and_floor;

import java.util.Scanner;

public class Floor_of_no {
    private int[] data;
    Floor_of_no(int[] arr){
        this.data=arr;
    }
    int celling(int no){
        int s=0;

        int e=data.length-1;
        if(no>data[e]){
            return e;
        }
        return bSearch(s,e,no);
    }
    private int bSearch(int s,int e,int no) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (data[mid] == no) {
            return mid;
        }
        else if (data[mid] < no) {
            if (data[mid + 1] > no) {
                return mid;
            } else {
                return bSearch(mid + 1, e, no);
            }
        } else {
            return bSearch(s, mid - 1, no);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        Celling_of_no obj=new Celling_of_no(arr);
        Floor_of_no obj2 = new Floor_of_no(arr);
        int i=in.nextInt();
        System.out.println(obj.celling(i));
        System.out.println(obj2.celling(i));

    }
}
