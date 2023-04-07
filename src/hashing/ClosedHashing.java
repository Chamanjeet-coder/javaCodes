package hashing;

public class ClosedHashing {
    private int _tableSize;
    private int _numberOfKeysInTable;
    private Integer[]_table;//to store integer
    ClosedHashing(){
        this._tableSize=10;
        this._table=new Integer[_tableSize];
        this._numberOfKeysInTable=0;
    }
    public void insert(Integer Key){
        int temp=Key%_tableSize;
//        do {
//            if (_table[temp]==null){
//                _table[temp]=Key;
//                System.out.println(temp + " = "+Key);
//
//            }
//        }
    }
}
