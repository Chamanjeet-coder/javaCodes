package Simple_comands;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no to be factorized");
        int a= in.nextInt();
        int b=2;
        while (a!=1){
            if(a%b==0){
                System.out.print(b);
                if (b!=a){
                    System.out.print('*');
                }
                a/=b;
                b=2;
            }
            else {
                b++;
            }

        }
    }
}
