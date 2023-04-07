package Simple_comands;

import java.util.Scanner;

public class oddOccurence {
    int[] arr;
    int n;
    oddOccurence(){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }
    //finds missing no in range 1 to n+1
    int missingNo(){
        int res=0;
        for (int i=0;i<n;i++){
            res^=arr[i];
            res^=i+1;
        }
        res^=n+1;
        return res;
    }
    //finds one odd occurring element with O(n)
    int finder(){
        int res=0;
        for (int i=0;i<n;i++){
            res^=arr[i];
        }
        return res;
    }
    //finds two odd occurring element with O(n)
    void twoFinder(){
        int xor=0;
        for (int i=0;i<n;i++){
            xor^=arr[i];
        }
        int bit= ~(xor^(xor-1));
        int ans=0;
        for (int i=0;i<n;i++){
            if ((arr[i]&bit)!=0){
                System.out.println(arr[i]);
            }
            else {
                ans^=arr[i];
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        oddOccurence obj=new oddOccurence();
        obj.twoFinder();
    }
}
