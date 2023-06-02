package com.geekForGeeksDSCourse.Ch4Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int input = 432;

        System.out.println(sumOfDigits(input));
    }
    public static int sumOfDigits(int num){
        if (num==0){
            return 0;
        }
        return sumOfDigits(num/10)+num%10;
    }
}
