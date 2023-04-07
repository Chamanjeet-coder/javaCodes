package Simple_comands;

public class TypeCasting {
    String K;
    String getString(){
        return K;
    }
    public static void main(String[] args) {
        float f=98.9f;
        short s=198;
        int i=219139;
        char c ='s';
        double d=98.97;
        byte b=98;
        String k;
        //System.out.print((s*f) + " and " +(i*b) +" and "+ (d/c) + " and " + (int)(c));
        TypeCasting obj=new TypeCasting();
        System.out.println(obj.getString());
        //java 8 features
        //optional class
        //date & time
    }
}
