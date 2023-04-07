package Simple_comands;

import java.util.Scanner;

public class bit {
    int n;
    int k;
    int[] table;
    //846928030
    bit(){
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
        table=new int[256];
        initializer();
//        k= in.nextInt();
    }
    void initializer(){
        table[0]=0;
        for (int i=1;i<256;i++){
            table[i]=(i&1)+table[i/2];
        }
    }
    public int getK() {
        return k;
    }

    public int getN() {
        return n;
    }

    void kthBit(){
         kthBit(getN(),getK());
    }
//    void kthBit(int n,int k){
//        int a=1;
//        a<<=(k-1);
//        a=(n ^ a);
//        if( a < n){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }
//    }
    //another method
//    void kthBit(int n,int k){
//        if((n&(1<<(k-1)))!=0){
//            System.out.println("yes");
//        }
//        else {
//            System.out.println("no");
//        }
//    }
    //another method
void kthBit(int n,int k){
    if(((n>>(k-1))&1)==1){
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    }
}
int countBit(){
        return countBit(getN());
}
//time complexity=total bit count
//int countBit(int n){
//        int ans=0;
//
//        while(n!=0){
//            if ((n&1)==1){
//                //System.out.println(a);
//                ans++;
//            }
//            n>>=1;
//        }
//        return ans;
//}

//time complexity=set bit count(log n)
// algorithm is also known as Brian Kernighan's Algorithm
//    int countBit(int n){
//        int res=0;
//        while (n>0){
//            n=(n&(n-1));
//            res++;
//        }
//        return res;
//    }

//time complexity O(1) but preprocessing is required
//also known as lookup Table method
// hexadecimal representation of 8 set bits is 0xff
// 0x is written before any no in hexadecimal form
int countBit(int n){
        int res=table[n&0xff];
        n=n>>8;
        res+=table[n&0xff];
        n=n>>8;
        res+=table[n&0xff];
        n=n>>8;
        res+=table  [n&0xff];
        return res;
}

int rightMostBit(){
        return rightMostBit(n);
}

int rightMostBit(int n){
    int res=0;
        while (n>0){
            res=n;
            n=(n&(n-1));
        }
        return res;
}
    public static void main(String[] args) {
        bit obj=new bit();
        System.out.println(obj.rightMostBit());
    }
}
