package com.geekForGeeksDSCourse.Ch4Recursion;

public class V9SumOfNNumbers {
    public static void main(String[] args) {

        System.out.println(recur_sum(5));

    }

    static int  recur_sum(int n){
        if(n==0) return n;
        return n+ recur_sum(n-1);
    }
}
