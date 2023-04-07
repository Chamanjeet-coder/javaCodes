package dynamicPrograming;

import java.util.Arrays;
import java.util.Scanner;

public class lcs {
    String s1;
    int m;
    String s2;
    int n;
    int[][] memo;

    lcs() {
        Scanner in = new Scanner(System.in);
        s1 = in.nextLine();
        m = s1.length();
        s2 = in.nextLine();
        n = s2.length();
        memo = new int[m + 1][n + 1];
        //this code is not needed in tabulation
//        for (int i=0;i<=m;i++){
//            Arrays.fill(memo[i],-1);
//        }
    }

    int commonSequence() {
        return commonSequence(s1, s2, m, n);
    }
    // non dynamic soln O(2^(m+n))
//    int commonSequence(String s1,String s2,int m,int n){
//        if(m==0||n==0){
//            return 0;
//        }
//        if(s1.charAt(m-1)==s2.charAt(n-1)){
//            return 1+commonSequence(s1,s2,m-1,n-1);
//        }
//        else {
//            return Math.max(commonSequence(s1,s2,m-1,n),commonSequence(s1,s2,m,n-1));
//        }
//    }

    //dynamic soln O(mn)
//int commonSequence(String s1,String s2,int m,int n){
//    if(m==0||n==0){
//        memo[m][n]=0;
//        return memo[m][n];
//    }
//    if(memo[m][n]==-1) {
//        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
//            memo[m][n]= 1 + commonSequence(s1, s2, m - 1, n - 1);
//        } else {
//            memo[m][n]= Math.max(commonSequence(s1, s2, m - 1, n), commonSequence(s1, s2, m, n - 1));
//        }
//    }
//    return memo[m][n];
//}

    //dynamic tabulation soln O(mn)
    int commonSequence(String s1, String s2, int m, int n) {
        for (int i = 0; i <= n; i++) {
            memo[0][i] = 0;
        }
        for (int i = 0; i <= m; i++) {
            memo[i][0] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }
        return memo[m][n];
    }

    public static void main(String[] args) {
        lcs obj = new lcs();
        System.out.println(obj.commonSequence());
    }
}
