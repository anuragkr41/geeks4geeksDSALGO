package com.geekForGeeksDSCourse.Ch4Recursion;

public class V10Factorial {
    public static void main(String[] args) {
        System.out.println(factorialTE(5, 1));

    }

    public static int factorial (int n){
        if (n==0) return 1;
        return n*factorial(n-1); // But this is not the tail end recursion
    }
    public static int factorialTE(int n, int k){
        if (n==0) return k;
        System.out.println(n+" , " +k);
        return factorialTE(n-1, k*n);
    }
}
