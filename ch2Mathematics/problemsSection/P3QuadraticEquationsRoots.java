package com.geekForGeeksDSCourse.ch2Mathematics.problemsSection;

import java.util.ArrayList;

public class P3QuadraticEquationsRoots {
    private static int a, b, c;

    public static void main(String[] args) {
        a = 1;
        b = -7;
        c = 12;

        // 752 904 164
        System.out.println(new P3Solver().quadraticRoots(a, b, c));
    }
}

class P3Solver {
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        ArrayList<Integer> arr = new ArrayList<>();
        if (d == 0) {
            arr.add((int) Math.floor(-b / (2.0 * a)));
            arr.add((int) Math.floor(-b / (2.0 * a)));
        }

        // For the imaginary root
        else if (d < 0) {
            arr.add(-1); //Roots are imaginary and we are not going to compute the complex number root
        }

        //For the real root (if d>0)

        else {
            int root1 = (int) Math.floor((-b + Math.sqrt(d)) / (2.0 * a));
            int root2 = (int) Math.floor((-b - Math.sqrt(d)) / (2.0 * a));
            arr.add(Math.max(root1,root2));
            arr.add(Math.min(root1, root2));
        }

        return arr;
    }


}