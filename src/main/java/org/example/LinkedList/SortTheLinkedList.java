package org.example.LinkedList;

public class SortTheLinkedList {
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
        SortTheLinkedList sl = new SortTheLinkedList();
        sl.push(2);
        sl.push(3);
        sl.push(1);
        sl.push(4);
        sl.push(6);

        System.out.println("Before sorting");
        sl.printList(sl.head);
        Node h = sl.sortList(sl.head);
        System.out.println("Before sorting");
        sl.printList(h);
    }

    private Node sortList(Node head) {
        if(head == null || head.next == null)
            return head;

        Node middle = middleNode(head);
        Node middleNext = middle.next;
        middle.next = null;

        Node left =  sortList(head);
        Node right = sortList(middleNext);

        return sortedMerge(left,right);
    }

    private Node sortedMerge(Node left, Node right) {
        Node temp = null;
        if(left == null)
            return right;
        if(right == null)
            return left;

        if(left.data < right.data) {
            temp = left;
            temp.next = sortedMerge(left.next,right);
        } else {
            temp = right;
            temp.next = sortedMerge(left,right.next);
        }
        return temp;
    }

    private Node middleNode(Node temp) {
        if(temp == null)
            return temp;

        Node slow = temp;
        Node fast = temp;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
