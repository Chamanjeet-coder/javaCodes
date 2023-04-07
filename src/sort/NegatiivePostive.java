package sort;

import java.util.Arrays;
import java.util.Scanner;

public class NegatiivePostive {
    Integer[] arr;
    int n;
    NegatiivePostive(){
        Scanner in=new Scanner(System.in);
        System.out.print("Input the array length: ");
        n=in.nextInt();
        arr=new Integer[n];

        System.out.print("Input the array: ");
        for (int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
    }
    void Print(){
        System.out.print("The array after sorting is: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void Sort_it(){
        Arrays.sort(arr,(i,j)->{
            if(i<0 && j<0 || j>0 && i>0){
                return 0;
            }else {
                if (i<0){
                    return -1;
                }else return 1;
            }
        });
    }

    public static void main(String[] args) {
        NegatiivePostive obj=new NegatiivePostive();
        obj.Sort_it();
        obj.Print();
    }
}
