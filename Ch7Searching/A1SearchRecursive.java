package com.geekForGeeksDSCourse.Ch7Searching;

public class A1SearchRecursive {
    public static void main(String[] args) {

        int [] input = {10,20,30,40,50,60,70,80,90,100};
        int num=30;
        int low = 0;
        int high = input.length;
        int found = searchForElement(input, num, low, high);

        if(found==-1){
            System.out.println("Element Not Found");
        }
        else {
            System.out.println("Element Found "+found);
        }
    }
    public static int searchForElement(int [] arr, int num, int low, int high){

        if(low>high){
            return -1;
        }

        int mid = (low + high)/2;

        if(arr[mid] == num){
            return mid;
        }

        else if(num<arr[mid]) {
            return searchForElement(arr, num, low, mid-1);
        }
        else{
            return searchForElement(arr, num, mid+1, high);
        }


    }
}
