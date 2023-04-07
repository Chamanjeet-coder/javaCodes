package sort;

import java.util.Scanner;

public class PrefixArr {
    int arr[];
    int n;
    PrefixArr(int n,int[] arr){
        this.n=n;
        this.arr=arr;
    }



    int prefixAtIndex(int n){
        int ans=0;
        for(int i=0;i<=n;i++){
            ans+=arr[i];
        }
        return ans;
    }
    int[] prefixArray(){
        int[] ans=new int[n];
        ans[0]=arr[0];
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1]+arr[i];
        }
        return  ans;
    }
    void printArr(int[]arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        PrefixArr obj=new PrefixArr(n,arr);
        //obj.printArr(obj.prefixArray());
        //System.out.println(obj.prefixAtIndex(2));
        System.out.println(obj.prefixAtIndex(2));
    }
}
