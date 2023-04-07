package binaryTree;

import java.util.Scanner;

class Node{
    Node left;
    Node right;
    char ch;
    String str;
    double db;
    int in;
    Node(Integer n){
        in=n;
        left=null;
        right=null;
    }
}
public class Binarytree{
    private Node root;
    Binarytree(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        root=new Node(n);
    }

    public static void main(String[] args) {

    }

}
