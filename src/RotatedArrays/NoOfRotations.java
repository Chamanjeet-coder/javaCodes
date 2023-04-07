package RotatedArrays;

import java.util.Scanner;

public class NoOfRotations {
    private int[] arr;
    private int n;
    NoOfRotations(){
        Scanner in=new Scanner(System.in);
        System.out.print("input Array-Length: ");
        n=in.nextInt();
        arr=new int[n];
        System.out.print("input Array: ");
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }
    void no_of_Rotations(){
        if (n<2){
            System.out.println("array is empty or the array does not have sufficient elements to be rotated");
        } else if (arr[0]<arr[n-1]) {
            System.out.println("Array is not rotated");

        }
        else {
            for (int i=0;i<n-1;i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("no of rotations: " + (i+1));
                }
            }
        }
    }
    int no_of_Rotations_with_return(){
        if (n<2){
            return 0;
        } else if (arr[0]<arr[n-1]) {
            return 0;

        }
        else {
            for (int i=0;i<n-1;i++) {
                if (arr[i] > arr[i + 1]) {
                    return i+1;
                }
            }
            return -2;
        }
    }
    int usingBinarySearch(){
        return usingBinarySearch(0,n-1);
    }
    int usingBinarySearch(int l,int r){
        if (n<=1){
            return -1;
        }
        if (arr[0]<arr[n-1]){
            return 0;
        }
        int mid;
        while (l<r){
            mid=l+(r-l)/2;

             if (arr[mid]<arr[(mid-1+n)%n] && arr[mid]<arr[(mid+1)%n]) {
                return mid;
            }
            if (arr[mid]<arr[r] /*&& arr[mid]<arr[mid+1]*/){
                r=mid;
            }
            else {
                l=mid+1;
            }
        }
        return l;
    }
    void min(){
        /*0(n) complexity
        int ans=no_of_Rotations_with_return();
         */
        int ans=usingBinarySearch();
//        System.out.println(ans);
        if (ans>=0){
            System.out.println("output is "+ans);
        }
        else {
            System.out.println("array is small or equal to 1");
        }
    }
    public static void main(String[] args) {
        NoOfRotations obj =new NoOfRotations();
        //obj.no_of_Rotations();
        obj.min();
    }
}
