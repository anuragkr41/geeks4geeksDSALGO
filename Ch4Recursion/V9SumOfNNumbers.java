package com.geekForGeeksDSCourse.Ch4Recursion;

public class V9SumOfNNumbers {
    public static void main(String[] args) {

        System.out.println(recur_sum(5, 0));

    }


    static int  recur_sum(int n , int k){
        if(n==0) return k;
        System.out.println(n +" , "+k);
        return recur_sum(n-1, k+n);
    }
}
