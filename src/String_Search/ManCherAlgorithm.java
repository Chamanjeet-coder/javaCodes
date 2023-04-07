package String_Search;

import java.util.Scanner;

public class ManCherAlgorithm {
    String main;
    Scanner in;
    ManCherAlgorithm(String useless){
        in=new Scanner(System.in);
        useless=in.nextLine();
        this.main=useless;
        main=main.trim();
    }
    char[] converter(){
        int n=main.length();
        int k=2*n+3;
        char[] ans=new char[k];
        ans[0]='@';
        ans[k-1]='$';
        int j=0;
        for (int i=1;i<k-1;i++){
            if(i%2==1){
                ans[i]='#';
            }
            else {
                ans[i]=main.charAt(j);
                j++;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        String mf="";
        ManCherAlgorithm obj=new ManCherAlgorithm(mf);
        System.out.println(obj.converter());
    }
}
