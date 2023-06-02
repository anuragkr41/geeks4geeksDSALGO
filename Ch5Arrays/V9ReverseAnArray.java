package com.geekForGeeksDSCourse.Ch5Arrays;

public class V9ReverseAnArray {
    public static void main(String[] args) {
        int [] input = {1,2,3,12,4,53,545,78932,23,345};
        int [] result = reverseArray(input);
        for (int num: result) {
            System.out.print(num + " ");

        }
    }

    public static int[] reverseArray(int [] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=temp;
        }
        return arr;
    }
}
