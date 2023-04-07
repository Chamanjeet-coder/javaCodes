package Simple_comands;

import java.util.Arrays;
import java.util.Scanner;

public class primeNo {
    int n;
    primeNo(int n){
        this.n= n;
    }
    boolean isPrime(){
        return isPrime(this.n);
    }
    boolean isPrime(int n){
        if(n<2){
            return false;
        } else if (n == 2 || n == 3 ) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0  ){
            return false;
        } else {
            int k=5;
            while(k*k<=n){
                if (n%k==0 || n%(k+2)==0){
                    return false;
                }
                k+=6;
            }
            return true;
        }
    }

    void primeInRange(){
        //naive
        if (n<2){
            return;
        }
        for (int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    void primeInRangeOptimized(){
        primeInRangeOptimized(n);
    }
    void primeInRangeOptimized(int n){
        boolean[] arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for (int i=2;i<=n;i++){
            if(arr[i]){
                System.out.print(i+" ");
                int k=i*i;
                while (k<=n){
                    arr[k]=false;
                    k+=i;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        primeNo obj= new primeNo(n);
        //obj.primeInRange();
        obj.primeInRangeOptimized();
    }
}
