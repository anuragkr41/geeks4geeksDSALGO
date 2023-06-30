package com.geekForGeeksDSCourse.Ch12LinkedLists;

/*class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next= null;
    }
}*/
public class V10InsertAtEndSLL {
    public static void main(String[] args) {
        Node head = new Node(534);
        head.next = new Node (77);
        head.next.next = new Node (645);
        head.next.next.next = new Node(45);

        print(head);

        head = insertAtEnd(head, 76);

        System.out.println();

        print(head);


    }

    private static Node insertAtEnd(Node head, int x) {
        Node n = head;
        Node temp = new Node(x);
        if (n == null){
            return temp;
        }

        while (n.next!=null){
            n = n.next;

        }
        n.next=temp;

        return head;

    }

    public static void print(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

}
