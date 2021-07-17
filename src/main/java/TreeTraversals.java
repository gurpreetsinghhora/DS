/**
 * Created by gurpreet on 17/7/21.
 */
public class TreeTraversals {

    public static void main(String arg[]){


        /*
        *               12
        *
        *        10            17
        *
        *     7      11     15      21
        *
        *
        *
        *
        *
        * */

        Node root =new Node(12);
        root.left = new Node(10);
        root.right = new Node(17);
        root.left.left= new Node(7);
        root.left.right = new Node(11);
        root.right.left = new Node(15);
        root.right.right = new Node(21);

        TreeTraversals treeTraversals = new TreeTraversals();

        System.out.println("inOrderTraversal");
        treeTraversals.inOrderTraversal(root);
        System.out.println("--------------");
        System.out.println("preOrderTraversal");
        treeTraversals.preOrderTraversal(root);
        System.out.println("--------------");
        System.out.println("postOrderTraversal");
        treeTraversals.postOrderTraversal(root);
        System.out.println("--------------");

    }

    public void inOrderTraversal(Node root){

        if(root==null){
               return;
        }

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root){

        if(root==null){
            return;
        }

        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root){

        if(root==null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }


}


class Node{

    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
