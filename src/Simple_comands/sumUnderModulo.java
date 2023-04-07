package Simple_comands;

import java.util.Scanner;

public class sumUnderModulo {
    long a;
    long b;
    int modulo;
    sumUnderModulo(){
        modulo=1000000007;
        Scanner in=new Scanner(System.in);
        a= (in.nextLong()%modulo);
        b= (in.nextLong()%modulo);
    }
    long modulaSum(){
        return (a+b)%modulo;
    }

    int modulaMultiplication(){
        return (int)((a*b)%modulo);
    }
    public static void main(String[] args) {
        sumUnderModulo obj=new sumUnderModulo();
        System.out.println(obj.modulaSum());
        System.out.println(obj.modulaMultiplication());
    }
}
