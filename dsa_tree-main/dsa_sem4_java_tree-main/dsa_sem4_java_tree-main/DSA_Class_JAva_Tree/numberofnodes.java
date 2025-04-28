import java.util.*;



public class treenumberofnodes{
    static  class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    public static int countNodes(Node root) {
        if (root == null)
            return 0;
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);
        return 1 + leftNodes + rightNodes;

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.right = new Node(80);

        System.out.println("Number of the nodes " + countNodes(root));
    }
}

