package Binary_and_Linear_search;

import java.util.Scanner;


public class MountainPeak {
    private int[] data;
    MountainPeak(int[]data){
        this.data=data;
    }
    int FindingPeakUsingBinearySearch(){
        int s=0;
        int e=data.length;
        return FindPeak(s,e);
    }
    int FindPeak(int s,int e){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(data[mid-1]<data[mid] && data[mid]>data[mid+1]){
            return mid;
        }
        else if (data[mid-1]<data[mid] && data[mid]<data[mid+1]){
            return FindPeak(mid+1,e);
        }
        else {
            return FindPeak(s,mid-1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= in.nextInt();
        }
        MountainPeak obj=new MountainPeak(arr);
        int x=obj.FindingPeakUsingBinearySearch();
        System.out.print("The no at peak is "+arr[x] +" and is at index at "+x);
    }
}
