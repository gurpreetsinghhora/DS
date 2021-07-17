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

        treeTraversals.inorderTraversal(root);

    }

    public void inorderTraversal(Node root){

        if(root==null){
               return;
        }

        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
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
