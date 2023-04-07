package Simple_comands;

import java.util.Scanner;

public class allDivisors {
    int n;
    allDivisors(){
        Scanner in =new Scanner(System.in);
        n= in.nextInt();
    }
    void printDivisors(){
        int i;
        for ( i=1;i*i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }
        for ( ;i>=1;i--){
            if (n%i==0 && i!=n/i){
                System.out.print(n/i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        allDivisors obj=new allDivisors();
        obj.printDivisors();
    }
}
