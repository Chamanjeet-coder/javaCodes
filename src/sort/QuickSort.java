package sort;

import java.util.Random;
import java.util.Scanner;
public class QuickSort {
    private  int[] arr;int n;
    QuickSort(){
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

// This sorts but not an array with duplicate elements
//    void Sort_it(){
//        sorter(0,n-1);
//    }
//
//    private void partition(int position){
//        int value=arr[position];
//        int i=0;
//        while (i<position){
//            if (arr[i]>value){
//                int j=position+1;
//                while (true){
//                    if (arr[j]<value){
//                        Swap (j,i);
//                        break;
//                    }
//                    else {
//                        j++;
//                    }
//                }
//            }
//            i++;
//        }
//    }
//    private void sorter(int l,int r){
//        if (l>=r){
//            return;
//        }
//        int value=arr[l];
//        int position=0;
//        for (int i=0;i<n;i++) {
//            if (arr[i] < value) {
//                position++;
//            }
//        }
//        if (position!=l){
//            Swap(l,position);
//        }
//        partition(position);
//        sorter(l,position-1);
//        sorter(position+1,r);
//
//    }
    void  Sort_it(){
        Sort_it(0,n-1);
    }
    void Sort_it(int l,int r){
        if (l>=r){
            return;
        }
        int pi=partition(l,r);
        Sort_it(l,pi-1);
        Sort_it(pi+1,r);
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
        QuickSort obj=new QuickSort();
        obj.Sort_it();
        System.out.println(obj.GetRandom(0,100));
        obj.Print();
    }
}