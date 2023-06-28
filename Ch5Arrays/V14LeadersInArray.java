package com.geekForGeeksDSCourse.Ch5Arrays;

public class V14LeadersInArray {
    public static void main(String[] args) {
        int [] input = {7,10,4,6,5,2};
        int[] outputNaive = NaiveSolution.solver(input);
        int[] outputOptimized = OptimizedSolution.solver(input);

        outputOptimized=reverse(outputOptimized);

        for (int num: outputNaive) {
            System.out.print(num+" ");

        }
        System.out.println();

        for (int num: outputOptimized) {
            System.out.print(num+" ");

        }
    }

    public static int [] reverse(int [] arr){

        int n = arr.length;
        for(int i=0; i<n/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]=temp;
        }

        return arr;
    }

}
class NaiveSolution{
    public static int[] solver(int [] arr){
        int [] res = new int[arr.length];
        int count =0;

        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=i+1; j< arr.length;j++){
                if(arr[i]<=arr[j]) {
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                res[count]=arr[i];
                count++;

            }
        }


        return res;

    }

}
class OptimizedSolution{
    public static int[] solver(int [] arr){
        // The last element is already a leader.

        int [] res = new int[arr.length];

        int currLeader = arr[arr.length-1];
        res[0]= currLeader;
        int count =1;

        for(int i=arr.length-2; i>=0; i--){
            if (currLeader<arr[i]){
                currLeader = arr[i];
                res[count]= currLeader;
                count++;
            }
        }
        return res;

    }

}
