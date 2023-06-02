package com.geekForGeeksDSCourse.Ch5Arrays;

public class V10RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] input = {1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 23};
        int[] arr = sortedOptimized(input);

        for (int num : arr) {
            System.out.print(num + " ");

        }

    }

    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;

            }

        }
        return temp;
    }

    public static int[] sortedOptimized(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return arr;
    }
}
