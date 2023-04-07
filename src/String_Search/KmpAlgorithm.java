package String_Search;

import java.util.Arrays;
import java.util.Scanner;

public class KmpAlgorithm {
    char[] main;
    char[] to_be_found;

    KmpAlgorithm() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the main string: ");
        main = in.next().toCharArray();
        System.out.print("Input the string to be found: ");
        to_be_found = in.next().toCharArray();
    }
//brute force approach
    int[] find() {
        if (main == null || to_be_found == null) {
            return new int[]{-1};

        }
        int n = main.length;
        int m = to_be_found.length;
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i + m - 1 < n; i++) {
            for (int j = 0; j < m; j++) {
                if (main[i + j] == to_be_found[j]) {
                    if (j == m - 1) {
                        arr[count] = i;
                        count++;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (count < n) {
            arr[count] = -1;
        }
        if (count == 0) {
            return (new int[]{-1});

        } else {
            return arr;
        }
    }
    //solr/elasticsearch

    //pi table(this table is right)
    int[] PiTable(){
        int n=to_be_found.length;
        int[] Table=new int[n];
        //Arrays.fill(Table,0);
        int j=0;
        for (int i=1;i<n;i++){
                if(to_be_found[i]==to_be_found[j]){
                    if(Table[i]<=j){
                        Table[i]=j+1;
                    }
                    //Table[i]=j;
                    j++;
                }
                else {
                    j=0;
                }

        }
        return Table;
    }

    //kmp algorithm
    int[]algorithm(){
        if (main == null || to_be_found == null) {
            return new int[] {-1};

        }
        int[]pi=PiTable();
        int n = main.length;
        int m = to_be_found.length;
        int[] arr = new int[n];
        int count = 0;
        int j=0;
        for (int i = 0; i + m - 1 < n; i++) {
            while (j<m){
                if (main[i + j] == to_be_found[j]) {
                    if (j == m - 1) {
                        arr[count] = i;
                        count++;
                        break;
                    }
                    else {
                        j++;
                    }
                } else {
                    break;
                }
            }
            j=pi[j];
        }
        if (count < n) {
            arr[count] = -1;
        }
        if (count == 0) {
            return new int[]{-1};

        } else {
            return arr;
        }
    }
    void print_find(int[] n) {
        if (n.length == 1 && n[0] == -1) {
            System.out.println("not found");
        } else {
            System.out.print("index at which string found is : ");

            for (int j : n) {
                if (j == -1) {
                    break;
                } else {
                    System.out.print(j + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        KmpAlgorithm obj = new KmpAlgorithm();
        obj.print_find(obj.find());

    }
}
