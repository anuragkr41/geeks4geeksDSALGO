package com.geekForGeeksDSCourse.ch2Mathematics.problemsSection;

public class P9AdditionUnderModulo {
    public static void main(String[] args) {
        long a = Long.MAX_VALUE, b = Long.MAX_VALUE;
        //long a = 1000000007, b = 1000000007;
        System.out.println(new P9Solver().sumUnderModulo(a, b));
    }
}

class P9Solver {
    public static long sumUnderModulo(long a, long b) {
        // Yes you were right there has to be a distributive property to calculate this one
        // (a+b)%c = (a%c + b%c)%c


        return  (a % (long) (Math.pow(10, 9) + 7) + b % (long)(Math.pow(10, 9) + 7)) % (long) (Math.pow(10, 9) + 7);
    }
}