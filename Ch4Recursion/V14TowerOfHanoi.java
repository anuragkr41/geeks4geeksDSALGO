package com.geekForGeeksDSCourse.Ch4Recursion;

public class V14TowerOfHanoi {
    public static void main(String[] args) {

        toi(3,'A','B','C');
    }
    public static void toi(int n, char A, char B, char C){
        if (n==1){
            System.out.println("Move 1 from " + A +  " to " + C);
            return;
        }
        toi(n-1, A, C, B);
        System.out.println("Move " +n+ " from " + A +  " to " + C);

        toi(n-1, B, A, C);



    }
}
