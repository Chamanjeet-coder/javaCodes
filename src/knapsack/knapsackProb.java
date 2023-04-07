package knapsack;

import java.util.Scanner;

public class knapsackProb {
    int n;
    int availableTime;
    int[] marks;
    int[] time;
    knapsackProb(){
        Scanner in=new Scanner(System.in);
        availableTime=in.nextInt();
        n= in.nextInt();
        marks=new int[n];
        time=new int[n];
        for (int i=0;i<n;i++){
            marks[i]= in.nextInt();
        }
        for (int i=0;i<n;i++){
            time[i]= in.nextInt();
        }
    }


    //not a dp soln
//    int recursiveSoln(int[] marks,int n,int[] time,int availableTime){
//        if(availableTime==0){
//            return 0;
//        }
//        if(n==0){
//            return 0;
//        }
//        else {
//            if(availableTime-time[n-1]>=0 ){
//                return Math.max(recursiveSoln(marks, n - 1, time, availableTime), marks[n - 1] + recursiveSoln(marks,n-1,time,availableTime-time[n-1]));
//            }
//            else {
//                return recursiveSoln(marks, n - 1, time, availableTime);
//            }
//        }
//    }

    int recursiveSoln(){
        return recursiveSoln(marks,n,time,availableTime);
    }

    //dp soln
    int recursiveSoln(int[] val,int n,int[] wt,int w){
        int[][] dp=new int[n+1][w+1];
        for (int i=0;i<=w;i++){dp[0][i]=0;}
        for (int i=0;i<=n;i++){dp[i][0]=0;}
        for (int i=1;i<=n;i++){
            for (int j=1;j<=w;j++){
                if(wt[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),dp[i-1][j]);
                }
            }
        }
        return dp[n][w];
    }

    public static void main(String[] args) {
        knapsackProb obj=new knapsackProb();
        System.out.println(obj.recursiveSoln());

    }
}
