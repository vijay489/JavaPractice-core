package Trees;

import java.util.*;

public class BottomViewOfBinaryTree {
    Node root;

     static class Node{
        int data;
        int hd;
        Node left,right;

        Node(int d){
            data = d;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        printBottomView(root);
    }

    private static void printBottomView(Node root) {

        if(root == null)
            return;
        int hd = 0;
        Map<Integer,Integer> dataMap = new LinkedHashMap<>();
        Queue<Node> queue = new LinkedList<>();
        root.hd = hd;
        queue.add(root);

        while (!queue.isEmpty()) {

            Node temp = queue.remove();
            hd = temp.hd;
            dataMap.put(hd,temp.data);

            if(temp.left != null){
               temp.left.hd = hd -1;
               queue.add(temp.left);
            }

            if(temp.right != null ){
                temp.right.hd = hd +1;
                queue.add(temp.right);
            }
        }

        for(Map.Entry<Integer,Integer> entry : dataMap.entrySet()){
            System.out.print(entry.getValue()+" ");
        }
    }
}
