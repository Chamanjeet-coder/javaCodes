package Simple_comands;

import java.util.Scanner;

public class kadaneAlgo {
    static int maxSum(int[]arr,int n){
        int ans=0;
        int currSum=0;
        for (int i=0;i<n;i++){
            if (currSum<0){
                currSum=0;
            }
            currSum+=arr[i];
            ans=Math.max(currSum,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(maxSum(arr,n));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println((int)1e9);
    }
}
