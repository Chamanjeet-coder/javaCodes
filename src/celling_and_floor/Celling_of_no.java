package celling_and_floor;

import java.util.Scanner;

public class Celling_of_no {
    private int[] data;
    Celling_of_no(int[] arr){
        this.data=arr;
    }
    int celling(int no){
        int s=0;
        int e=data.length-1;
        return bSearch(s,e,no);
    }
    private int bSearch(int s,int e,int no){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(data[mid]==no){
            return mid;
        }
        else if (data[mid]>no){
            if(mid-1<0){
                return 0;
            }
            if (data[mid-1]<no){
                return mid;
            }
            else {
                return bSearch(s,mid-1,no);
            }
        }
        else {
                return bSearch(mid+1,e,no);
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
        System.out.println(obj.celling(in.nextInt()));
    }

}


