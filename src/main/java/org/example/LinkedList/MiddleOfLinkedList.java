package org.example.LinkedList;

public class MiddleOfLinkedList {
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
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        ml.push(2);
        ml.push(4);
        ml.push(7);
        ml.push(6);
        ml.push(5);
        ml.push(1);

        ml.printList();
        int middle = ml.findMiddle(ml.head);
        int m2 = ml.slowFastMethod(ml.head);
        System.out.println("middle of list: " +middle +" ,using slow and fast :" + m2);
    }

    private int slowFastMethod(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    int findMiddle(Node head){
        if(head == null)
            return 0;
        int n =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        System.out.println("total size: "+n);

        int count = 1;
        while(count < n/2){
            head = head.next;
            count++;
        }
        return head.data;
    }

}
