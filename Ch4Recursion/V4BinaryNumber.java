package com.geekForGeeksDSCourse.Ch4Recursion;

public class V4BinaryNumber {
    private static final int input = 8;
    public static void main(String[] args) {
        solve(input);
    }
    static void solve(int number){
        if(number == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        solve(number/2);
        sb.append(number%2);
        System.out.print(sb);
    }
}


