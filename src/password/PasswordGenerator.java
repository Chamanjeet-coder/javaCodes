package password;

import java.util.Random;

public class PasswordGenerator {
    String SmallLetter="abcdefghigjklmonopqrstuvwxyz";
    String CapLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String special="!@#$%^&*~*()_";
    Random rand;
    PasswordGenerator(){
        rand= new Random();
    }
    char[] Generator(){
        int length= rand.nextInt(10,20);
        char [] ans= new char[length];
        for(int i=0;i<length;i++){
            if(i%3==0){
                ans[i]=CapLetter.charAt(rand.nextInt(0,25));
            }
            else if(i%3==1){
                ans[i]=SmallLetter.charAt(rand.nextInt(0,25));
            }
            else {
                ans[i]=special.charAt(rand.nextInt(0,10));
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        PasswordGenerator obj= new PasswordGenerator();
        System.out.println(obj.Generator());
    }
}
