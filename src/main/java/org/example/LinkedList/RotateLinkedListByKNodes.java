package org.example.LinkedList;

public class RotateLinkedListByKNodes {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    void push(int d){
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }

    void printList(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateLinkedListByKNodes rl = new RotateLinkedListByKNodes();
        rl.push(7);
        rl.push(6);
        rl.push(5);
        rl.push(4);
        rl.push(3);
        rl.push(2);
        rl.push(1);

        System.out.println("Before Rotation");
        rl.printList();
        rl.rotateBYKNode(3);
        System.out.println("After Rotation");
        rl.printList();
    }

    private void rotateBYKNode(int k) {
        if(k == 0)
            return;

        int count =1;
        Node temp = head;
        while(count < k && temp != null)
        {
            temp = temp.next;
            count++;
        }
        if (temp == null)
            return;
        Node kNode = temp;

        while (temp.next != null)
            temp = temp.next;

        temp.next = head;
        head = kNode.next;
        kNode.next = null;

    }
}
