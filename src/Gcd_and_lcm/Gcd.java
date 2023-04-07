package Gcd_and_lcm;

import java.util.Scanner;
public class Gcd {
    private int number1,number2;
    Gcd(int no1,int no2){
        this.number1=no1;
        this.number2=no2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    int getGCD() {
        //o(n) complexity
//        int gcd=0;
//        for (int i=1;i<=number1 &&i<=number2;i++){
//            if (number1%i==0 && number2%i==0){
//                gcd=i;
//            }
//        }
//        return gcd;


//second method
        int number2 = this.number2;
        int number1 = this.number1;
//no need to set the bigger no as number1 the loop does it for you
//        if (number2 > number1) {
//            int temp = number1;
//            number1 = number2;
//            number2 = temp;
//        }
        int remainder = number2;
        while (number1 % number2 != 0) {
            System.out.println(number1+"  "+ number2);
            remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        return remainder;
    }
//        third euclidean Algorithm
    int getGcd(int a,int b){
        System.out.println(a+"  "+b);
        if(b==0) {
            return a;
        }else {
            return getGcd(b, a % b);
        }
    }

    int GetLcm(){
        if(number1==0||number2==0){
            return 0;
        }
        return (number1*number2/getGCD());
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the first no: ");
        int a= in.nextInt();
        System.out.print("Enter the second no: ");
        int b= in.nextInt();
        Gcd obj= new Gcd(a,b);
        System.out.println("Gcd is "+obj.getGcd(obj.getNumber1(), obj.getNumber2()));
        System.out.println("Lcm is "+obj.GetLcm()+".");

    }
}