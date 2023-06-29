package com.geekForGeeksDSCourse.Ch12LinkedLists;

public class V8RecursiveTraversalSingleLL {
    public static void main(String[] args) {
        Node list = new Node(534);
        list.next = new Node(56);
        list.next.next = new Node (65);
        list.next.next.next = new Node (23);

        print(list);

    }

    public static void print(Node head){
        //Here we have to define the head node
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");

        print(head.next);
    }
}
//Iterative solution is better than recursive solution as there is not auxilarry space required.



/*
class Node{
    int data;
    Node next;

    Node(int x){
        data =x;
        next = null;

    }
}
*/