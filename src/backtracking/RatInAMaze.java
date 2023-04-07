package backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class RatInAMaze {
    int[][]arr;
    int n;
    RatInAMaze(int n,int[][]arr){
        this.n=n;
        this.arr=arr;;
    }
    boolean isSafe(int[][] arr, int c, int r, int n){
        return r>=0 && r < n && c>=0 && c < n && arr[r][c] == 1;
    }

    public int getN() {
        return n;
    }

    public int[][] getArr() {
        return arr;
    }

    public boolean findPath(int[][] sol) {
        return findPath(sol,getArr(),getN(),0,0);
    }

    private boolean findPath(int[][] sol, int[][] arr, int n, int r, int c) {
        if(r==n-1 && c==n-1 && isSafe(arr,c,r,n)){
            sol[r][c]=1;
            return true;
        }
        if (isSafe(arr, c, r, n) && sol[r][c]!=1) {
            sol[r][c] = 1;
            if (findPath(sol, arr, n, r + 1, c)) {
                return true;
            }
            if (findPath(sol, arr, n, r, c + 1)) {
                return true;
            }
            if (findPath(sol, arr, n, r - 1, c)) {
                return true;
            }
            if (findPath(sol, arr, n, r, c - 1)) {
                return true;
            }
            sol[r][c] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]= in.nextInt();
            }
        }
        int[][]sol=new int[n][n];
        RatInAMaze obj=new RatInAMaze(n,arr);
        if(obj.findPath(sol)){
            System.out.println("path found:-");
            for(int i=0;i<n;i++){
                for (int j = 0; j < n; j++) {
                    System.out.print(sol[i][j]+" ");
                }
                System.out.println();
            }
        }else System.out.println("not found");
    }
}
