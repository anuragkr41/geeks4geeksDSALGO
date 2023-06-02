package com.geekForGeeksDSCourse.Ch5Arrays;

public class V8isSorted {
    public static void main(String[] args) {

        int[] input = {1, 2, 45, 76, 354};
        System.out.println(isSorted(input));
    }

    public static boolean isSorted(int[] arr) {
        //boolean isDecreasing=false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
                return false;
            }
            if (i == arr.length - 1) return true;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }


        return true;
    }
}
