package sort;

import java.util.Scanner;

public class MergeSort {
    private int n;
    int[] arr;
    MergeSort(){
        Scanner in =new Scanner(System.in);
        n= in.nextInt();
        arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }

    void Print(){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    int[] sortArr(int[] arr, int n)
    {
        // code here
        bogoSort(arr);

        return arr;
    }
    void bogoSort(int[] a) {
        // if array is not sorted then shuffle the
        // array again
        System.out.println(" i reached");
        while (isSorted(a) == false) {
            Print();

            shuffle(a);
        }

    }

    // To generate permutation of the array
    void shuffle(int[] a)
    {
        // Math.random() returns a double positive
        // value, greater than or equal to 0.0 and
        // less than 1.0.
        for (int i = 1; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }

    // Swapping 2 elements
    void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // To check if array is sorted or not
    boolean isSorted(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }

    void Sorter(){
        Sorter(0,n-1);
    }

    void Sorter(int left,int right){
        if (left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        Sorter(left,mid);
        Sorter(mid+1,right);
        Merge(left,mid,right);
    }
    void Merge(int left, int mid, int right){
        int length=mid-left +1;
        int length2=right-mid;
        int[] arr1=new int[length];
        int[] arr2= new int[length2];


        for (int i=0; i<length;i++){
            arr1[i]=arr[left+i];
        }
        for (int i=0; i<length2;i++){
            arr2[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=left;
        while (i<length && j<length2){
            if (arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while (j<length2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
     int[] getArr() {
        return arr;
    }
    int getN(){
        return n;
    }

    public static void main(String[] args) {
        MergeSort obj=new MergeSort();
        obj.sortArr(obj.getArr(), obj.getN());
        obj.Print();
    }


}
