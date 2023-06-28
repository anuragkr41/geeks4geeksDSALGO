package com.geekForGeeksDSCourse.Ch5Arrays;

public class V13LeftRotateDElements {
    public static int[] rotate(int [] arr, int d){
        arr=reverse(arr, 0, d-1 );
        arr= reverse(arr,d, arr.length-1);
        arr = reverse(arr, 0 , arr.length-1);


        return arr;
    }
    public static int [] reverse(int [] arr, int low, int high){

        int temp=0;
        while(low<high){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return arr;
    }

    public static void main(String [] args){
        int[] input= {1,23,45,65,7,86};
        input=rotate(input, 2);
        for(int num: input){
            System.out.print(num + " ");

        }
    }
}
