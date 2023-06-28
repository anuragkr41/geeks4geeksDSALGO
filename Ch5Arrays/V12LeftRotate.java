package com.geekForGeeksDSCourse.Ch5Arrays;

public class V12LeftRotate {
    public static void main(String[] args) {
        int [] input = {12,432,54,2,33};
        input=rotate(input);
        input=rotate(input);
        for(int num: input){
            System.out.print(num+" ");
        }

    }
    public static int [] rotate(int [] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;

        return arr;

    }
}
