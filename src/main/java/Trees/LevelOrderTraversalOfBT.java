package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfBT {
    Node root;

    static class Node{
        int data;
        Node left,right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        printLevelOrderTraversal(root);
    }

    private static void printLevelOrderTraversal(Node root) {
        if(root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp = queue.poll();
            System.out.print(temp.data+" ");

            if(temp.left != null)
                queue.add(temp.left);

            if(temp.right != null)
                queue.add(temp.right);
        }
    }
}
