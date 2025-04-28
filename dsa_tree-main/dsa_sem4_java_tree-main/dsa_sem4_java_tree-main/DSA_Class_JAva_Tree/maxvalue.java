import java.util.*;

public class treemaxvalue {
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

    public static int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int leftMax = max(root.left);
        int rightMax = max(root.right);

        return Math.max(root.data,Math.max(leftMax, rightMax));
    }

    public static  Node insertData(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertData(root.left, data);
        } else if (data > root.data) {
            root.right = insertData(root.right, data);
        }

        return root;
    }

    public static void binaryTree(Node root) {
        if (root == null)
            return;
        binaryTree(root.left);
        System.out.print(root.data + " ");
        binaryTree(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(24);
        root.right = new Node(59);

        root.left.right = new Node(11);
        root.right.left = new Node(9);

        System.out.println("Maximum value of node in Tree is "+max(root));



    }
}
