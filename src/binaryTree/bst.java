package binaryTree;

import java.util.Scanner;

public class bst {

    //Create an Inner Class : Node
    private static class Node {
        /*
         * Fields
         */
        private int value;
        private Node left;
        private Node right;

        /*
         * Constructor
         */
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }


    private Node root;


    public bst() {

        this.root = null;

    }


    public static void getLine() {
        System.out.println("\n");
    }


    //Add a node to the Binary Tree ------------------------------------------------------------------------------------------------------

    /*
     * Add Node Recursively
     */
    public void add(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node root, int value) {

        //Case 1: When root is null
        if (root == null) {
            return new Node(value);
        }

        //Case 2: When root is not null
        if (value < root.value) {
            root.left = addNode(root.left, value);        //recursive call - left
        } else if (value > root.value) {
            root.right = addNode(root.right, value);    //recursive call - right
        } else {
            return root;                                //value already exists
        }

        return root;
    }

    public Node getRoot() {
        return root;
    }

    String maxPath(Node root){
        String ans="";
        ans=solve(root,ans);
        return ans;
    }
    String solve(Node root, String ans){
        if (root != null) {
            ans += solve(root.right, ans);
            ans = root.value + " "+ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        bst obj=new bst();
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        for(int i=0;i<n;i++){
            obj.add(in.nextInt());
        }
        System.out.println(obj.maxPath(obj.getRoot()));
    }
}
