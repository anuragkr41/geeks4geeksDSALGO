package com.geekForGeeksDSCourse.Ch12LinkedLists;

public class V9InsertingAtTheBeginningOfSLL {
    public static void main(String[] args) {

        Node head = null;
        head = insertBeginning(head, 20);
        head = insertBeginning(head, 5345);
        head = insertBeginning(head, 74);

        //Insert node at the beginning
        System.out.println();
        print(head);

    }

    public static Node insertBeginning(Node head , int x){
        Node temp = new Node(x);
        temp.next=head;
        return temp;

    }
    public static void print(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
}
/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
 */
