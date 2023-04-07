package Simple_comands.recursion;

import java.util.Scanner;

public class ropeProb {
    int a;
    int b;
    int c;
    int n;
    ropeProb(){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        a=in.nextInt();
        b= in.nextInt();
        c=in.nextInt();
    }
    int ans(){
        return ans(n,a,b,c);
    }
    int ans(int n){
        return ans(n,a,b,c);
    }
    int ans(int n,int a,int b,int c){
        if (n<0){
            return -1;
        }
        if(n==0){
            return 0;
        }
        int noOfPieces=1;
        noOfPieces+=Math.max(Math.max(ans(n-a),ans(n-b)),ans(n-c));
        if(noOfPieces==0){
            return -1;
        }
        return noOfPieces;

    }

    public static void main(String[] args) {
        ropeProb obj=new ropeProb();
        System.out.println(obj.ans());
    }
}
