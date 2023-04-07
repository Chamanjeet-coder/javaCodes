package Simple_comands.recursion;

import java.util.Scanner;

public class subsetSum {
    int[] arr;
    int n;
    int sum;
    subsetSum(){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        sum=in.nextInt();
    }

    int findSubSets(){
        int k=1<<(n);
        //System.out.println(k);
        return findSubSets(arr,sum,k-1);
    }
    int findSubSets(int no){
        return findSubSets(arr,sum,no);
    }
    int findSubSets(int[]arr,int sum,int no){
        if(no==0){
            if(sum==no){
                return 1;
            }
            else {
                return 0;
            }
        }
        int i=0;
        int ans=0;
        while(i<n) {
            if ((no & (1 << i)) != 0) {
                ans += arr[i];
            }
            i++;
        }
        if(ans==sum){
            return 1+findSubSets(no-1);
        }
        return findSubSets(no-1);
    }

    public static void main(String[] args) {
        subsetSum obj=new subsetSum();
        System.out.println(obj.findSubSets());
    }
}
