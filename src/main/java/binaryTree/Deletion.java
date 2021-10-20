package binaryTree;

/**
 * Created by gurpreet on 18/10/21.
 */
public class Deletion {

    static class Node
    {
        int key;
        Node left, right;

        // Constructor
        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }


    static Node temp ;
    static Node deepest;
    static boolean flag=true;
    public static void main(String args[])
    {
        Node root;
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        temp=root;
        inorder(root);
        System.out.println();
        int key = 7;

        delete(root, key);

        inorder(root);

    }

    // Inorder traversal of a binary tree
    static void inorder(Node temp)
    {
        if (temp == null)
            return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }


    public static void delete(Node root , int key){
       deleteNode(root,key);

    }

    // find and delete the deepest right most node
    public static Node deepestNode(Node root){

        if(root.right==null){
            deepest=root;
            return null;
        }

        if(root!=null && root.right!=null){
            root.right=deepestNode(root.right);
        }
        return root;

    }

    // delete the key node and swap it with deepest node
    public static void deleteNode(Node root , int key ){

        if(root.key==key){
            deepestNode(temp);
            root.key=deepest.key;
        }

        if(root!=null && root.right!=null){
            deleteNode(root.right,key);
            deleteNode(root.left,key);
        }
    }
}
