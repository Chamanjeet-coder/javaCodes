package sort;

import java.util.Arrays;
import java.util.Scanner;

public class evenFirst {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Integer[] arr=new Integer[n];
        for (int x=0;x<n;x++) {
             arr[x]= in.nextInt();
        }
        Arrays.sort(arr,(i,j)->{
            if(i%2==0 && (j%2)==0){
                return i-j;
            } else if (i%2==0) {
                return -1;
            } else if (j % 2 == 0) {
                return 1 ;
            }else {
                return i-j;
            }
        });
        for (int x=0;x<n;x++) {
            System.out.print(arr[x]+" ");
        }
    }
}
