package Simple_comands;

import java.util.Scanner;


public class Fibonacci {

    static int result(int no){
        if ((no==0)||(no==1)){
            return no;
        }
        return (result(no-1)+ result(no-2));
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b=result(a);
        System.out.println(b);
    }
}
