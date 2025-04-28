import java.util.*;

public class treeheight{
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
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftH = heightOfTree(root.left);
        int rightH = heightOfTree(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.right = new Node(80);

        System.out.println("Height of the tree is " +heightOfTree(root));
    }
}

