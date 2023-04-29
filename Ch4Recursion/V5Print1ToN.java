package com.geekForGeeksDSCourse.Ch4Recursion;

public class V5Print1ToN {
    public static void main(String[] args) {
        int n=10;
        uptoN(n);
    }

    static void uptoN(int n){
        StringBuilder sb = new StringBuilder();
        if (n==-1) return;
        System.out.print(n + ", ");
        uptoN(n-1);

    }
}
