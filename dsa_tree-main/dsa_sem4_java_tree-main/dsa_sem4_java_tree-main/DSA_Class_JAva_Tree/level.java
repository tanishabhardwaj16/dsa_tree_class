import java.util.*;

public class treelevel {


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

    public static void printLevel(Node root, int level) {
        if (root == null)
            return;

        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }

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
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.right = new Node(60);


        root = insertData(root, 1);
        System.out.println("Inorder traversal");
        System.out.println(root.data);


        System.out.println("Level order 2");
        printLevel(root,2);
    }
}