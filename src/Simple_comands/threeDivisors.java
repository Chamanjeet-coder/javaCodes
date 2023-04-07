package Simple_comands;

import java.util.Arrays;
import java.util.Scanner;

public class threeDivisors {
    int n;
    threeDivisors(){
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
    }

    int suchDivisors(){
        boolean[] arr= new boolean[n+1];
        int ans=0;
        Arrays.fill(arr,true);
        for(int i=2;i<=n;i++){
            if(arr[i]){
                ans+=1;
                for (int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        return ans;

    }

    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        threeDivisors obj=new threeDivisors();
        System.out.println(obj.suchDivisors());

    }
}
