import java.util.Stack;

/**
 * Created by gurpreet on 17/7/21.
 */
public class InOrderTraversalWithoutRecursion {

    public static void main(String arg[]) {


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

        Node root = new Node(12);
        root.left = new Node(10);
        root.right = new Node(17);
        root.left.left = new Node(7);
        root.left.right = new Node(11);
        root.right.left = new Node(15);
        root.right.right = new Node(21);

        InOrderTraversalWithoutRecursion inOrderTraversalWithoutRecursion = new InOrderTraversalWithoutRecursion();

        System.out.println("inOrderTraversal");
        inOrderTraversalWithoutRecursion.inOrderTraversal(root);
    }


    public void inOrderTraversal(Node root){

        Stack<Node> stack = new Stack();


        if(root!=null){
            while(root!=null){
                stack.push(root.right);

                stack.push(root);
            }
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }


    }

}
