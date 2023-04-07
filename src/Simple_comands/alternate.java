package Simple_comands;

import java.util.Scanner;

public class alternate {
    int[] arr;
    int n;
    alternate(){
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
    }
    int length(){
        return length(arr,n);
    }
    int length(int[] arr,int n){
        int main=(arr[0]%2==0) ? 4:3;
        int length=1;
        int maxt=1;
        for(int i=1;i<n;i++){
            int nk=(arr[i]%2==0) ? 4:3;
            if(nk==main){
                maxt=Math.max(length,maxt);
            }
            else{
                length++;
                main=nk;
            }
        }
        maxt=Math.max(length,maxt);
        return maxt;
    }

    public static void main(String[] args) {
        alternate obj=new alternate();
        System.out.println(obj.length());
    }
}
