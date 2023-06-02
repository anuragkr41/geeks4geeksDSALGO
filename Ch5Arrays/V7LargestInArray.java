package com.geekForGeeksDSCourse.Ch5Arrays;

import java.util.Stack;

public class V7LargestInArray {

    private static int[] input = {12,23,534,21,3, 8, 23, 10,  123,  9, 25,  3, 19,  5,  4};
    public static void main(String[] args) {

        System.out.println(new V7Solver().max(input));
        System.out.println(new V7Solver().secondLargest(input) );
    }

}

class V7Solver{
    public static int max(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondLargest(int [] arr){

        int n = getLargestIndex(arr);
        int secondmax=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if (i==n) continue;
            if (arr[i]>secondmax){
                secondmax=arr[i];
            }
        }

        return secondmax;
    }
    public static  int getLargestIndex(int [] arr){
        int max=Integer.MIN_VALUE;
        int n=-1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
                n=i;
            }
        }
        return n;
    }
}
