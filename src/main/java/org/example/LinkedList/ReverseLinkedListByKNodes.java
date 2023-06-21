package org.example.LinkedList;

class ReverseLinkedListByKNodes {
        Node head;
        class Node {
            Node next ;
            int data ;
            Node(int d){
                data = d;
                next = null;
            }
        }

        Node reverseListWithKsize(Node head,int k){
            if(head == null)
                return null;
            Node current = head;
            Node next = null;
            Node prev = null;

            int count = 0;

            while (count < k && current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            if (next != null)
                head.next = reverseListWithKsize(next, k);

            return prev;
        }

         void printList(){
            Node temp = head;
            while(temp !=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

         void push(int d){
            Node new_node = new Node(d);
            new_node.next = head;
            head = new_node;
        }

    public static void main(String args[])
    {
        ReverseLinkedListByKNodes llist = new ReverseLinkedListByKNodes();

        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("Given Linked List");
        llist.printList();

        llist.head = llist.reverseListWithKsize(llist.head, 3);

        System.out.println("Reversed list");
        llist.printList();
    }
}
