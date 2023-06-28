package com.geekForGeeksDSCourse.RandomQuestionPractice.Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class QUnion {
    public Node union (Node list1, Node list2){
        List<Integer> arr = new ArrayList<>();
        return list1;
    }
}

class Node{
    int data;
    Node next;

    public Node(){

    }
    public Node(int x){
        data=x;
        next=null;
    }

}

class Main{
    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.next= new Node(23);
        list1.next.next = new Node(54);
        list1.next.next.next = new Node(45);

        print(list1);

    }

    public static void print(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }

    }
}
