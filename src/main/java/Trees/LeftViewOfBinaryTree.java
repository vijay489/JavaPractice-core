package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    Node root;

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int d){
            data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        printLeftView(root);
    }

    private static void printLeftView(Node root) {
        if(root == null )
            return;

        Queue<Node> tree = new LinkedList<>();
        tree.add(root);

        while(!tree.isEmpty()){
            int n = tree.size();

            for(int i=1;i<=n;i++){
                Node temp = tree.poll();

                if(i==1)
                  System.out.print(temp.data+" ");

                if(temp.left != null)
                    tree.add(temp.left);

                if(temp.right != null)
                    tree.add(temp.right);
            }
        }
    }
}
