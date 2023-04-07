package hashing;

import Simple_comands.Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class subArrayWithGivenSum {
    int[]arr;
    int n;
    subArrayWithGivenSum(int n, int[]arr){
        this.n=n;
        this.arr=arr;
    }
    int  isThere(int sum){
        HashMap<Integer,Integer> U= new HashMap<>();
        int prefixSum=0;
        int res=0;
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            if(U.containsKey(prefixSum-sum)) {
                res= Math.max(i- U.get(prefixSum-sum),res);

            }
            else if (prefixSum==sum) {
                res=i+1;
            }
            else{
                U.put(prefixSum,i);
            }

        }
//        int[] ans= new int[end-start+1];
//        for(int i=start;i<=end;i++){
//            ans[i-start]=arr[i];
//        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        int sum=in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        subArrayWithGivenSum obj=new subArrayWithGivenSum(n,arr);
        System.out.println(obj.isThere(sum));
    }
}
