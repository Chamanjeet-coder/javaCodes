package Simple_comands;

import java.util.Scanner;

public class Codeoo {
    String input;
    Codeoo(String k){
        input=k;
    }
    void print(){
        System.out.println(input);
    }
    interface MessageContract{
        void print();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String k= in.next();
        Codeoo obj=new Codeoo(k);
        obj.print();
    }


}
