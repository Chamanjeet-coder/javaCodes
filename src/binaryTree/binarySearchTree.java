package binaryTree;

import java.util.Scanner;


public class binarySearchTree {
    class Node{
        int key;
        Node left;
        Node right;
        Node(int value){
            this.key=value;
            left=null;
            right=null;
        }
    }

    Node root;
    binarySearchTree(){
        root=null;
    }
    void insert(int key) { root = insertRec(root, key); }

    // A recursive function to
    // insert a new key in BST
    Node insertRec(Node root, int key)
    {
        // If the tree is empty,
        // return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recur down the tree
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        // Return the (unchanged) node pointer
        return root;
    }
    void print(){
        print(root.left);
        System.out.print(root.key+" ");
        print(root.right);
        System.out.println();
    }
    void print (Node root){
        if(root==null){
            return;
        }
        print(root.left);
        System.out.print(root.key+" ");
        print(root.right);
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        binarySearchTree obj=new binarySearchTree();
        for(int i=0;i<n;i++){
            int k=in.nextInt();
            obj.insert(k);
        }
        obj.print();
    }

}
