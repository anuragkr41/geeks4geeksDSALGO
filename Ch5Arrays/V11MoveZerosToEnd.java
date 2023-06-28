package com.geekForGeeksDSCourse.Ch5Arrays;

public class V11MoveZerosToEnd {
    public static int[] moveZeros(int [] arr){
        /*
        Approach is to create a temp array that will contain the zeros if an element from arr is found zero
        Elements will be shifted to the left whenever there is a zero
         */
        int place=0;
        for(int i=0;i< arr.length;i++){
            if( arr[i]!=0) { //we have to keep the track of i and swap it with the next non zero
                int temp=arr[place];
                arr[place]=arr[i];
                arr[i]=temp;
                place++;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int [] input={1,2,0,56,0,34,2,0,23,0,0,0,45,4};
        int [] res= moveZeros(input);
        for (int num: res){
            System.out.print(num+" ");
        }
    }
}
