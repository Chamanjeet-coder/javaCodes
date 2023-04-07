package Simple_comands;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true){
            Scanner in=new Scanner(System.in);
            int no1,no2;
            char operator = in.next().charAt(0);
            if((operator=='-')||(operator=='/')||(operator=='*')||(operator=='%')||(operator=='+')){
                no1=in.nextInt();
                no2=in.nextInt();

                if(operator=='-'){
                    System.out.println(no1-no2);
                }
                else if(operator=='+'){
                    System.out.println(no1+no2);
                }
                else if(operator=='%'){
                    System.out.println(no1%no2);
                }
                else if(operator=='/'){
                    System.out.println(no1/no2);
                }
                else if(operator=='*'){
                    System.out.println(no1*no2);
                }
            }
            else if ((operator=='x')||(operator=='X')){
                break;
            }
            else {
                System.out.println("invalid operation");
            }
        }
    }
}
