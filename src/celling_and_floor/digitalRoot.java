package celling_and_floor;

import java.util.Scanner;

public class digitalRoot {
    int n;
    digitalRoot(){
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
    }
    int cal(){
        return cal(n);
    }
    int cal(int n){
        if(n/10==0){
            return n;
        }
        int ans=0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        return cal(ans);
    }

    public static void main(String[] args) {
        digitalRoot obj=new digitalRoot();
        System.out.println(obj.cal());
    }
}
