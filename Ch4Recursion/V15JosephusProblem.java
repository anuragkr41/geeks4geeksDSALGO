package com.geekForGeeksDSCourse.Ch4Recursion;

//In this question we have n number of people sitting in a circular arrangement and every kth person is to be killed...
//We have to calculate who will be the last person standing.
public class V15JosephusProblem {
    public static void main(String[] args) {

        int result = jos(5, 3);
        System.out.println(result);
    }

    public static int jos(int n, int k){

        if(n==1) return 0;

        else {
            return (jos(n-1, k)+k)%n;
        }

    }
}
