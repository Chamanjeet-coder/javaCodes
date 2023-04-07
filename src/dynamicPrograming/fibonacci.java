package dynamicPrograming;

import java.util.Scanner;

public class fibonacci {
    int[] memo;
    int n;
    fibonacci(){
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        memo=new int[n+1];
    }

    public int getN() {
        return n;
    }

    int fib(){return fib(getN());}
    int fib(int n){

        if(memo[n]==0){
            if(n<=1){
                return n;
            }
            memo[n]=fib(n-1)+fib(n-2);
        }
        return memo[n];

    }
    int tabulation(int n){
        memo[0]=0;
        memo[1]=1;
        for(int i=2;i<=n;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }

    public static void main(String[] args) {
        fibonacci obj=new fibonacci();
        System.out.println(obj.tabulation(obj.getN()));
    }
}
