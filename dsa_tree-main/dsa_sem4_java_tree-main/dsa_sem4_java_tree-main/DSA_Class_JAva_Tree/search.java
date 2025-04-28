import java.util.*;


public class treesearch {
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
    public static boolean searchNode(Node root, int key) {
        while (root != null) {
            if (root.data == key) return true;
            if (key < root.data) root = root.left;
            else root = root.right;
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.right = new Node(80);

        System.out.println("node present in the tree : " + searchNode(root, 40));
    }
}

