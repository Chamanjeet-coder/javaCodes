package hashing;

public class DirectAddressTable {
    boolean[] table;
    DirectAddressTable(){
        table=new boolean[1000];
    }
    void insert(int n){
        table[n]=true;
    }
    void delete(int n){
        table[n]=false;
    }
    boolean search(int n){
        if(n<1000  && n>=0){
            return table[n];
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        DirectAddressTable obj=new DirectAddressTable();
        obj.insert(10);
        obj.insert(20);
        obj.insert(119);
        if(obj.search(10)){
            System.out.println("10 is found");
        }
        else{
            System.out.println("10 not found");
        }
        if(obj.search(20)){
            System.out.println("20 is found");
        }
        else{
            System.out.println("20 not found");
        }
        obj.delete(119);
        if(obj.search(119)){
            System.out.println("119 is found");
        }
        else{
            System.out.println("119 not found");
        }

    }
}
