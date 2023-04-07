package Simple_comands;

import java.util.Scanner;

public class computationPower {
    int n;
    int power;
    computationPower(){
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        power=in.nextInt();
    }

    public int getN() {
        return n;
    }

    public int getPower() {
        return power;
    }

    int process(){
        return process(getN(),getPower());
    }

    int process(int n,int power){
        int temp;

        if(power==0) {
            return 1;

        }
        temp=process(n,power/2);
        temp*=temp;
        if(power%2==0) {
            return temp;
        }
        else {
            return temp*n;
        }
    }

    int iterative(){
        int n=this.getPower();
        int res=1;
        int x=this.getN();
        while(n>0) {
            if(n%2!=0){
                res*=x;
            }
            x*=x;
            n/=2;
        }
        return res;
    }

    public static void main(String[] args) {
        computationPower obj=new computationPower();
        System.out.println(obj.iterative());
    }
}
