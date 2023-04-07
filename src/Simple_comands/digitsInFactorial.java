package Simple_comands;

import java.util.Scanner;

public class digitsInFactorial {
    int n;
    Scanner in;
    digitsInFactorial(){
        in=new Scanner(System.in);
        n= in.nextInt();
    }
    int noOfDigits(){
        double ans=0;
        for (int i=1;i<=n;i++){
            ans+=Math.log10(i);
        }
        return (int)ans+1;
    }

    public static void main(String[] args) {
        digitsInFactorial obj=new digitsInFactorial();
        System.out.println(obj.noOfDigits());
    }
}
