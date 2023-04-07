package Simple_comands;

import java.util.Scanner;

public class prefixMatrix {
    int[][] arr;
    int n;
    prefixMatrix(int[][] arr,int n){
        this.arr=arr;
        this.n=n;
    }
    int[][]matrix(int[][] arr,int n){
        int[][] ans=new int[n][n];
        int prevSumVertical=0;
        int prevSumHorizontal=0;

        for (int i = 0; i < n; i++) {
                ans[i][0] = prevSumVertical + arr[i][0];
                prevSumVertical += arr[i][0];
                ans[0][i] = prevSumHorizontal + arr[0][i];
                prevSumHorizontal += arr[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j=1;j<n;j++){
                     ans[i][j]=ans[i-1][j]+ans[i][j-1];
            }
        }

        return  ans;
    }
    void print(int[][]arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int[][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        prefixMatrix obj= new prefixMatrix(arr,n);
        obj.print(obj.matrix(arr,n),n);
    }
}
