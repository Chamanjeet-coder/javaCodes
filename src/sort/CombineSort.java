package sort;

import java.security.Key;
import java.util.Random;
import java.util.Scanner;
public class CombineSort {
    private  int[] arr;int n;
    CombineSort(){
        Scanner in=new Scanner(System.in);
        System.out.print("Input the array length: ");
        n=in.nextInt();
        arr=new int[n];

        System.out.print("Input the array: ");
        for (int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
    }

    int GetRandom(int l, int r) {
        Random obj= new Random();

        return obj.nextInt(l,r);
    }
    private void Swap(int no1,int no2){
        int temp=arr[no1];
        arr[no1]=arr[no2];
        arr[no2]=temp;
    }

    void  Sort_it(){
        Sort_it(0,n-1);
    }
    void Sort_it(int l,int r){
        if (l>=r){
            return;
        }
        if (r-l<=5){
            InsertionSort(l,r);
            return;
        }
        int pi=partition(l,r);
        Sort_it(l,pi-1);
        Sort_it(pi+1,r);
    }
    void InsertionSort(int l,int r) {
        for (int i = l + 1; i <= r; i++) {
            int key = arr[i];
            int j=i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[++j]=key;
        }
    }
    int partition(int l, int r){
        int pivot=arr[r];
        int i=l;
        int j=r;
        while (i<j){
            while (arr[i]<=pivot && i<j){
                i++;
            }
            while (arr[j]>=pivot && j>i){
                j--;
            }
            Swap(i,j);
        }
        Swap(i,r);
        return i;
    }
    void Print(){
        System.out.print("The array after sorting is: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        CombineSort obj= new CombineSort();
        obj.Sort_it();
        obj.Print();
    }
}