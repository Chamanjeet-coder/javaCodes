package Sqrt;

import java.util.Scanner;

public class Sqrt {
        int Sqrt(int left,int right, int x){
            if(left+1==right){
                if(right*right>x){
                    return left;
                }
                else if(right*right==x){
                    return right;
                }
                else if (left*left==x){
                    return left;
                }
                else{
                    return right;
                }
            }
            int mid=left+(right-left)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid>x){
                return(Sqrt(left,mid,x));
            }
            else{
                return(Sqrt(mid,right,x));
            }
        }
        public int mySqrt(int x) {
            if (x==0){
                return 0;
            }
            if (x==1){
                return 1;
            }
            return Sqrt(0,x,x);
        }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Sqrt obj=new Sqrt();
        System.out.println(obj.mySqrt(in.nextInt()));
    }
}
