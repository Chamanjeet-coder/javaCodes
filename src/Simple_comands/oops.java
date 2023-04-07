package Simple_comands;

class animal{
    void work(String name){
        System.out.println("i eat,sleep and my name is "+name+" and i am a animal");
    }
}
class dog extends animal{
    int i;
    void callAnimal(String name){
        super.work(name);
    }
   dog(){
        super();
   }

    public void setI(int i) {
        this.i = i;
    }

    public int getI(){
        return i;
    }
}
class puppy extends dog{
    int no;
    puppy (){
        super();
        no=0;
    }
    void work(String name){
        System.out.println("i eat,sleep and my name is "+name+" and i am a puppy");
    }

    public int getIParent(int x) {
        super.setI(x);
        return super.getI();
    }

    void  callDog(String name){
        super.callAnimal(name);
    }

}

public class oops {
    public static void main(String[] args) {
        puppy obj= new puppy();
        //obj.callDog("brunny");
        obj.work("brunny");
        System.out.println(obj.getI()+" "+obj.getIParent(10));
    }

}
