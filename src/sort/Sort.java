package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    int n;
    int[]arr;
    Sort(int n,int[]arr){
        this.n=n;
        this.arr=arr;
    }
    void sort_it(){
        Arrays.sort(arr);
    }
    void print(){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void print_reverse(){
        for(int i=n-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        Sort obj=new Sort(n,arr);
        obj.sort_it();
        obj.print();
        obj.print_reverse();
    }
}
