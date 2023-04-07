package Simple_comands;

import java.util.Scanner;

public class powerSet {
    String s;
    powerSet(){
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
    }
    //O(2^n * n) time complexity
    void allPossibleString(){
        int n=s.length();
        int k=1<<n;
        for(int i=0;i<k;i++){
            if(i==0){
                System.out.println();
            }
            else {
                int j = 1;
                int pow=0;
                while (j <= i) {
                    if ((i&j)==j){
                        System.out.print(s.charAt(pow));
                    }
                    pow++;
                    j*=2;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        powerSet obj=new powerSet();
        obj.allPossibleString();
    }
}
