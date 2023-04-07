package String_Search;

import java.util.Scanner;

public class Zalgorithm {
    char[] main;
    char[] to_be_found;

    Zalgorithm() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the main string: ");
        main = in.next().toCharArray();
        System.out.print("Input the string to be found: ");
        to_be_found = in.next().toCharArray();
    }

    void print(int[] n) {

        int a = to_be_found.length;
        boolean b=false;
        for (int j : n) {
            if (j == a) {
                b=true;
                System.out.println("index at which string found is : "+ j);
            }
        }
        if (!b){
            System.out.println("not found or not possible");
        }
    }

    void CreateZarray() {
    }

    public static void main(String[] args) {
        Zalgorithm obj = new Zalgorithm();
        int[] arr = {};
        obj.print(arr);


    }
}
