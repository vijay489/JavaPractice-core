package org.example.LinkedList;

public class MergeTwoSortedLinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    void printList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    void push(int d){
        Node new_node = new Node(d);
        new_node.next = head;
        head = new_node;
    }
    public static void main(String[] args) {
        MergeTwoSortedLinkedList head1 = new MergeTwoSortedLinkedList();
        head1.push(7);
        head1.push(5);
        head1.push(3);
        head1.push(1);

        MergeTwoSortedLinkedList head2 = new MergeTwoSortedLinkedList();
        head2.push(4);
        head2.push(2);

        System.out.println("Before sorting");
        head1.printList(head1.head);
        head2.printList(head2.head);
        Node h = mergeList(head1.head,head2.head);
        System.out.println("After sorting");
        head1.printList(h);

    }

    private static Node mergeList(Node head1, Node head2) {
        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        if(head1.data < head2.data) {
            head1.next = mergeList(head1.next,head2);
            return head1;
        } else{
            head2.next = mergeList(head1,head2.next);
            return head2;
        }
    }

}
