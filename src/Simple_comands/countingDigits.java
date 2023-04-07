package Simple_comands;

import java.util.Scanner;

public class countingDigits {
    int n;
    Scanner in;
    countingDigits(){
        in=new Scanner(System.in);
        n= in.nextInt();
    }
    boolean palindrome(){
        int k=n;
        int reverse=0;
        if(k==0){
            return true;
        }
        while (k!=0){
            reverse=reverse*10+k%10;
            k/=10;
        }
        System.out.println(reverse);
        if (reverse==n){
            return true;
        }
        return false;
    }
    int count(){
        int k=n;
        int count =0;
        if(k==0){
            return 1;
        }
        while (k!=0){
            count++;
            k/=10;
        }
        return count;
    }

    public Scanner getIn() {
        return in;
    }

    public int getN() {
        return n;
    }
    int trailingZeroes(){
        int zeroes=0;
        int i=5;
        while(n>=i){
            zeroes+=n/i;
            i*=5;
        }
        return zeroes;
    }

    public static void main(String[] args) {
        countingDigits obj=new countingDigits();
        System.out.println(obj.trailingZeroes());
        System.out.println(obj.getIn());
    }
}
