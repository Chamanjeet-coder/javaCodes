package Simple_comands;


import java.util.Scanner;

public class PrefixArray {
    int[]arr;
    char[]arr2;
    PrefixArray(int[] arr){
        this.arr=arr;
    }
    PrefixArray(char[] arr){
        this.arr2=arr;
    }

    public int[] getArr() {
        return arr;
    }
    public char[] getArr2(){
        return arr2;
    }
    int[] array(int[]arr){
        int prevSum=0;
        int[] ans= new int[arr.length];
        for (int i=0;i<arr.length;i++){
            ans[i]=prevSum+arr[i];
            prevSum+=arr[i];
        }
        return ans;
    }
    char[] array(char[]arr){
        char prevSum=arr[0];
        char[] ans= new char[arr.length];
        for (int i=0;i<arr.length;i++){
            ans[i]=(char)( prevSum+arr[i]);
            prevSum+=arr[i];
        }
        return ans;
    }
    void printArr(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void printArr(char[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void printArr(String[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        char[] arr=new char[n];
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            char a=in.next().charAt(0);
            arr[i]=a;
        }
        PrefixArray obj=new PrefixArray(arr);
        obj.printArr(obj.array(obj.getArr2()));
    }
}
