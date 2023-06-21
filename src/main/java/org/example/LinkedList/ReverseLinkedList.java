package org.example.LinkedList;

public class ReverseLinkedList {
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

    void printList(Node head){
      Node temp = head;
      while(temp != null){
          System.out.print(temp.data+" ");
          temp = temp.next;
      }

      System.out.println();
    }

    public static void main(String[] args){
        ReverseLinkedList rl = new ReverseLinkedList();
        rl.push(1);
        rl.push(2);
        rl.push(3);
        rl.push(4);
        rl.push(5);
        rl.push(6);

        System.out.println("Before reversing");
        rl.printList(rl.head);
        Node pos = rl.reverseList(rl.head);
        System.out.println("After reversing");
        rl.printList(pos);
    }

    private Node reverseList(Node head) {
        Node curr = head;
        Node next = null;
        Node prev = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
