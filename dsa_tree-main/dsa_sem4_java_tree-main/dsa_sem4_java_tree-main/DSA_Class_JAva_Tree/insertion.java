import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class treeinsertion {

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
    public static void printPreorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public static void printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }

    public static void insertData(Node root, int key){
        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            if(temp.left==null){
                temp.left = new Node(key);
                break;
            }else queue.add(temp.left);

            if(temp.right==null){
                temp.right = new Node(key);
                break;
            }else queue.add(temp.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(51);
        root.right = new Node(52);
        root.left.right = new Node(53);
        root.right.left = new Node(54);
        root.left.left = new Node(55);
        root.right.right = new Node(58);

        System.out.println("Before Insertion : ");
        printInorder(root);
        insertData(root,40);
        insertData(root, 20);
        System.out.println();
        System.out.println("After Insertion : ");

        printInorder(root);
        System.out.println();

         System.out.println("Preorder Traversal:");
         printPreorder(root);

    }
}

