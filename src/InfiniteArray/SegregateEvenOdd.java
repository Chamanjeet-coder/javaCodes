package InfiniteArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SegregateEvenOdd {
    int[] arr;
    int N;

    SegregateEvenOdd() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        this.N = in.nextInt();
        System.out.print("input array : ");
        this.arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
    }

    void separator() {
        //method 1 o(2n)
        if (N <= 0) {
            System.out.println("No input");
            return;
        }
        Arrays.sort(arr);
        int[] ans = new int[N];

        int j = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                ans[j] = arr[i];
                j++;
                System.out.println(arr[i] + " " + ans[j - 1]);
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i]%2==1){
                ans[j]=arr[i];
                j++;
            }
        }
        this.arr = ans;

    }

    void Swap(int i, int K) {
        int key = arr[i];
        arr[i] = arr[K];
        arr[K] = key;
    }

    void print() {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SegregateEvenOdd obj = new SegregateEvenOdd();
        obj.separator();
        obj.print();

    }
}
