package com.geekForGeeksDSCourse.Ch10Hashing;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHash{
    static int BUCKET;
    static ArrayList<List<Integer>> table;

    MyHash(int b){
        BUCKET = b;
        table= new ArrayList<>();
        for(int i=0 ; i < b; i++){
            table.add(new ArrayList<>());
        }
    }

    static void insert(int key){
        //First we are going to do the base hash function

        int i = key % BUCKET;
        table.get(i).add(key);
    }

    static void remove(int key){
        int i = key % BUCKET;
        table.get(i).remove(key);
    }

    static boolean search(int key){
        int i = key % BUCKET;
        if (table.get(i).contains(key)) return true;
        return false;
    }

}

public class V7ImplementChaining {
    public static void main(String[] args) {

        MyHash mh = new MyHash(7);
        mh.insert(54);
        mh.insert(454);
        mh.insert(586);
        mh.insert(98);
        mh.insert(84);
        mh.insert(6);
        mh.insert(44);
        mh.insert(73);
        mh.insert(65);
        mh.insert(7);
        mh.insert(78);

        System.out.println(mh.search(6));

    }
}
