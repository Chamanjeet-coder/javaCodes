package Simple_comands;


import java.util.Scanner;

public class trainCap {
    int maxCapacity;
    int noOfStones;
    int[] stones;

    trainCap(){
        Scanner in=new Scanner(System.in);
        maxCapacity= in.nextInt();
        noOfStones= in.nextInt();
        stones=new int[noOfStones];
        for(int i=0;i<noOfStones;i++) {
            stones[i] = in.nextInt();
        }
    }
    int minRounds(){
        int currCap;
        int rounds=0;
        boolean[] help=new boolean[noOfStones];
        while(!checker(help)){
            currCap=0;
            for (int i=0;i<noOfStones;i++){
                if (help[i]){
                    continue;
                }
                if(currCap+stones[i]<=maxCapacity){
                    currCap+=stones[i];
                    help[i]=true;
                }
            }
            rounds++;
        }
        return rounds;
    }

    boolean checker(boolean[] arr){
        for (int i=0;i<noOfStones;i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        trainCap obj=new trainCap();
        System.out.println(obj.minRounds());
    }
}
