package knapsack;

import java.util.Arrays;

class item{
     int wt,val;
     public item(int w,int v){wt=w;val=v;}

}

public class fractionalKnapsack {
     static double fractKnapsack(item[] arr, int W) {
         Arrays.sort(arr, (Z, i) -> {
             int k=Z.wt*(i.val)-Z.val*(i.wt);
             if(k>0){
                 return 1;
             }
             else if(k==0){
                 return 0;
             }
             else {
                 return -1;
             }
         });
         double res = 0.0;
         for(int i=0;i<arr.length;i++){
             if(arr[i].wt<=W){
                 res+=arr[i].val;
                 W-=arr[i].wt;
             }
             else {
                 res+=arr[i].val*(double)W/(double) arr[i].wt;
                 break;
             }

         }
         return res;
     }
    public static void main(String[] args) {
        item[] arr={
                new item(10,60),
                new item(40,40),
                new item(20,100),
                new item(30,120),
        };
        int W=50;
        System.out.println(fractKnapsack(arr,W));

    }

}
