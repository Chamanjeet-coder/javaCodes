package Simple_comands;
import java.util.Scanner;


public class quadratic {
    int a;
    int b;
    int c;
    Scanner in;
    quadratic(){
        in=new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
        c= in.nextInt();
    }
    Double[] roots(){

        Double[]ans=new Double[2];
        int discriminant=b*b-4*a*c;
        if (discriminant<0 || a==0){
            ans[0]=null;
            ans[1]=null;
            return ans;
        } else if (discriminant==0) {
            ans[0]=(double)(-1*b)/(2*a);
            ans[1]=ans[0];
        }
        ans[0]= (-b+ Math.pow(discriminant,0.5))/(2*a);
        ans[1]=(-b- Math.pow(discriminant,0.5))/(2*a);
        return ans;
    }

    public static void main(String[] args) {
        quadratic obj=new quadratic();
        Double[]arr=obj.roots();
        System.out.println(arr[0]+" "+arr[1]);
    }
}
