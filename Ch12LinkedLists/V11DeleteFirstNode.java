package com.geekForGeeksDSCourse.Ch12LinkedLists;

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
public class V11DeleteFirstNode {
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(43);
        head.next.next  = new Node(534);
        print(head);

        head = deleteFirstNode(head);
        System.out.println();

        print(head);
    }

    public static void print(Node list){
        while(list != null){
            System.out.print(list.data+" ");
            list = list.next;
        }
    }

    public static Node deleteFirstNode(Node list){
        if(list==null){
            return null;
        }
        list = list.next;

        return list;

    }

}
