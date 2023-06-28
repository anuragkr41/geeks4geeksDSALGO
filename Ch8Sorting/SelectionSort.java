package com.geekForGeeksDSCourse.Ch8Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] input = {23,564,12,4,56,0,-234,4332,34,32};

        int temp = 0;
        for(int i=0; i<input.length-1; i++){
            int minIndx = i;
            for(int j=i+1; j<input.length; j++){
                if (input[j]<input[minIndx]){
                    minIndx=j;

                }
            }
            swap(input[minIndx], input[i]);
        }
        for(int i : input){
            System.out.print(i+" ");

        }
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b=temp;
    }

}
