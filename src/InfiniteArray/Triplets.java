package InfiniteArray;

import java.util.Arrays;
import java.util.Scanner;
//ques of finding triplet in array whose sum is 0
public class Triplets {
    int[] arr;
    int N;
    Triplets() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array size: ");
        this.N = in.nextInt();
        System.out.print("input array : ");
        this.arr = new int[N];
        for (int i:this.arr){
            arr[i]=in.nextInt();
        }
    }

    private boolean FindInArray(){
        if (N<3){
            return false;
        }
        Arrays.sort(arr);
        int k;
        for (int i=0;i<N;i++){
            k=N-i-1;
            int j=i+1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    return true;
                } else if (sum > 0) {
                    k--;
                }else {
                    j++;
                }
            }
        }
        return false;
    }

    void ans(){
        if(FindInArray()){
            System.out.println("Found");
        }
        else {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Triplets obj=new Triplets();
        obj.ans();
    }
}
