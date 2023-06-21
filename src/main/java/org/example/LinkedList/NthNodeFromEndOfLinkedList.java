package org.example.LinkedList;

public class NthNodeFromEndOfLinkedList {
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
        NthNodeFromEndOfLinkedList ml = new NthNodeFromEndOfLinkedList();
        ml.push(2);
        ml.push(4);
        ml.push(7);
        ml.push(6);
        ml.push(5);
        ml.push(1);

        ml.printList();
        ml.NthNodeFromEnd(ml.head,7);
    }

    private void NthNodeFromEnd(Node head, int m) {

        int n =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }

        if(m > n)
            return;


        temp = head;
        for(int i=1;i<n-m+1;i++) {
            temp = temp.next;
        }

        System.out.println("Nth node from End : "+temp.data);
    }
}
