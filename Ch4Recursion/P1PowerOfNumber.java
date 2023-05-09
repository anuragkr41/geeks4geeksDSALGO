package com.geekForGeeksDSCourse.Ch4Recursion;

public class P1PowerOfNumber {
    public static void main(String[] args) {
        

        System.out.println(power(3,3));
    }

    public static long power(int N, int R){
        if (R<=0) return 1;
        return N * power(N, R-1);
    }
}
