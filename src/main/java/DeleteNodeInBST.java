/**
 * Created by gurpreet on 30/8/21.
 */
public class DeleteNodeInBST {

    class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    public Node root;

    // This method mainly calls insertRec()
    void insert(int key) { root = insertRec(root, key); }

    Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
          return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    public static void main(String args[]){
        DeleteNodeInBST tree = new DeleteNodeInBST();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);


        tree.root=tree.deleteKey(tree.root,20);
        tree.root=tree.deleteKey(tree.root,50);

        tree.inorderRec(tree.root);

    }

    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    Node deleteKey(Node root , int key){

        if(root.key==key && root.left==null && root.right==null){
            root=null;
            return root;
        }else if(root.key==key && root.left!=null && root.right!=null){

            if(root.right.left!=null){
                root.right.left.left=root.left;
                root.right.left.right=root.right;
                root=root.right.left;
                root.right.left=null;
                return root;
            }else{
                root=root.right;
                root.right=null;
                return root;
            }
        }



        if(key>root.key){
            root.right=deleteKey(root.right,key);
        }else if(key<root.key){
            root.left=deleteKey(root.left,key);
        }
        return root;
    }
}
