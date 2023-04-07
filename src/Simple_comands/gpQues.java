package Simple_comands;

import java.util.Scanner;

public class gpQues {
    int a;
    int b;
    int n;
    gpQues(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        n= in.nextInt();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getN() {
        return n;
    }

    int calculateNth(){
        int a=getA();
        int r=getB()/a;
        int n=getN();
        return (int)(a*(Math.pow(r,n-1)));
    }

    public static void main(String[] args) {
        gpQues obj=new gpQues();
        System.out.println(obj.calculateNth());
    }
}
