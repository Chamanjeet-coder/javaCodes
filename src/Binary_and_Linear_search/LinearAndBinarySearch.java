package Binary_and_Linear_search;

import java.util.Scanner;
//for sorting
import java.util.Arrays;

public class LinearAndBinarySearch {
    private int[] arr;
    private int n;
    LinearAndBinarySearch(int[] arr, int k){
        this.n=k;
        /* manual copy
        for (int i=0;i<n;i++){
            this.arr[i]=arr1[i];
        }*/
        this.arr=arr;
        /*
        using arraycopy
        arr=new int[n];
        System.arraycopy(arr1, 0, this.arr, 0, n);
         */
    }
    int finder(int no,int StartingIndex,int EndingIndex){
        if (arr.length==0 || StartingIndex>=EndingIndex){
            return -1;
        }
        int mid=(StartingIndex+EndingIndex)/2;
        if (arr[mid]<no){
            return finder(no,mid+1,EndingIndex);
        }
        else if (arr[mid]==no){
            return mid;
        }
        else {
            return finder(no,StartingIndex,mid-1);
        }
    }
    int BinarySearch(int k){
        Arrays.sort(arr);
        int s=0;
        int e= arr.length-1;
        return finder(k,s,e);
    }
    int Search(int k){
       for (int i=0;i<n;i++){
           if (k==arr[i]){
               return i;
           }
       }
       return -1;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Array Size: ");
        int a= in.nextInt();
        System.out.print("Array Input: ");
        int[] arr=new int[a];
        for (int i=0;i<a;i++ ){
            arr[i]=in.nextInt();
        }
        LinearAndBinarySearch obj =new LinearAndBinarySearch(arr,a);
        System.out.print("Element to be Found: ");
        int NoToBeFound= in.nextInt();
        int result=obj.BinarySearch(NoToBeFound);
        if (result==-1){
            System.out.println("Element not present");
            return;
        }
        System.out.println("Element is present at: "+result);
    }
}
