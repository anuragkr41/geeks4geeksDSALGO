package com.geekForGeeksDSCourse.Ch12LinkedLists;

public class V7TraverseSingleLL {
    public static void main(String[] args) {
        Node list = new Node(654);
        list.next = new Node(43);
        list.next.next = new Node (614);
        list.next.next.next = new Node (-423);
        print(list);
    }

    public static void print(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+ " ");
            current=current.next;
        }
    }
}

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next=null;
    }
}