package com.geekForGeeksDSCourse.Ch4Recursion;

public class V12RopeCutting {
    public static void main(String[] args) {

        int n=23, a=11, b=9, c=12;
        int pieces = cutTheRope(n,a,b,c);
        System.out.println(pieces);

    }

    public static int cutTheRope(int n, int a, int b, int c){

        if(n==0) return 0;
        if (n<0) return -1;

        int result = Math.max(Math.max(cutTheRope(n-a, a, b, c), cutTheRope(n-b, a,b,c)), cutTheRope(n-c, a,b,c));

        if (result == -1)
            return -1;
        else
            return result+1;
    }
}
