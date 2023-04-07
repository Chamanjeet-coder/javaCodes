package sort;

import java.util.Scanner;

public class InsertionSort {
    int[] array;
    InsertionSort(int[] arr) {
        this.array = arr;
    }
    void Sort(){
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    void square(){
        for (int i=0;i<array.length;i++){
            array[i]=array[i]*array[i];
        }
    }
    void ques2(){
        int k=array[2]-array[1];
        for (int i=0;i<array.length;i++){
            array[i]=array[i]*2+k;
        }
    }
    void print(){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("input no elements in the array for 1st ques: ");
        int n= in.nextInt();
        int[] array=new int[n];
        System.out.print("input the array:");
        for (int i=0;i<n;i++){
            array[i]= in.nextInt();
        }
        System.out.print("output array is ");
        InsertionSort obj=new InsertionSort(array);
        obj.Sort();
        obj.square();
        obj.print();
        System.out.print("input no elements in the array for 2nd ques: ");
        int k= in.nextInt();
        int[] array2=new int[k];
        System.out.print("input the array:");
        for (int i=0;i<k;i++){
            array2[i]= in.nextInt();
        }
        InsertionSort obj2=new InsertionSort(array2);
        obj2.ques2();
        System.out.print("output array is ");
        obj2.print();
    }
}
