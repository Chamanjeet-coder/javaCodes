package InfiniteArray;


import java.util.Scanner;

public class SearchInInfinite {
    private int n; int[] arr;

    SearchInInfinite(){
        System.out.print("Input length of array: ");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.print("Input the array: ");
        arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

    }
    void  FindInArray(int k){
        int val=arr[0];
        int h=1;
        while (k<val){
            if (2*h<n){
                h=2*h;
            }
            else {
                h=n-1;
            }
            val=arr[h];
        }
    }
    public static void main(String[] args) {

    }
}
