package Simple_comands;

import java.util.Scanner;

public class powerOfTwo {
    int n;
    powerOfTwo (){
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
    }

    public int getN() {
        return n;
    }

    boolean isPower(){
        if(n==0){
            return false;
        }
        while (n!=1){
            if (n%2==1){
                return false;
            }
            n/=2;
        }
        return true;
    }
    //using brian's algorithm
    boolean isPower(int n){
        if(n==0) return false;
        return ((n&(n-1))==0);
    }
    public static void main(String[] args) {
        powerOfTwo obj=new powerOfTwo();
        System.out.println(obj.isPower(obj.getN()));
    }

}
