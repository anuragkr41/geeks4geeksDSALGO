package com.geekForGeeksDSCourse.Ch4Recursion;

public class V10Fibbonaci {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }

    public static int fib(int n){ //simple recursion to find the nth fibbonaci number
        if (n<=1) return n;
        System.out.println(n);
        return fib(n-1)+fib(n-2);
    }

    //Let us do it the tailend way


}
