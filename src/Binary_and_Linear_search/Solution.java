package Binary_and_Linear_search;

import java.util.Scanner;

class Solution {
    public int searchInsert(int[] numbs, int target) {

        return searcher(numbs,target,0,numbs.length-1);
    }
    private int searcher(int[]data,int target, int s,int e){
        if(target>data[e]){
            return e+1;
        }
        if(target==data[e]){
            return e;
        }

        if(target<=data[s] ){
            return s;
        }
        //never use (s+e)/2 in binary as there is risk of value going out of int range
        int mid =s+(e-s)/2;
        if(data[mid]==target){
            return mid;
        }
        else if(data[mid]>target){
            if(data[mid-1]<target){
                return mid;
            }

            else{
                return searcher(data,target,s,mid-1);
            }
        }
        else {
            if (data[mid + 1] > target) {
                return mid + 1;
            } else {
                return searcher(data, target, mid + 1, e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int target =in.nextInt();
        int[] numbs= new int[a];
        for (int i=0;i<a;i++){
            numbs[i]= in.nextInt();
        }
        Solution obj =new Solution();
        System.out.println(obj.searchInsert(numbs,target));
    }

}