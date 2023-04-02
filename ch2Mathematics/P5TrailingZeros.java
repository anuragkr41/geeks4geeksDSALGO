package com.geekForGeeksDSCourse.ch2Mathematics;

public class P5TrailingZeros {
    public static void main(String[] args) {

        Integer input = 15;
        System.out.println(new P5Solver().solve(input));

        //I was able to solve this using the O(n) complexity but a better solution is to just
        // return the division of the number by 5 which will take the O(1);
        // I have made the sure that the overflow issues is tackled in the problem


    }
}

class P5Solver{
    public Integer solve(Integer num){

        /*
        Approach, we have to find the trailing zeros factorial of a number...
        1. We need to figure out how many pairs of even number and 5 are there
        2X5 then how many there is 10 available
         */
        int count =0;
        for(int i =1; i <= num; i++){
            if(i%10==0 || i%5==0){
                count++;
            }
        }


        return count;
    }


}
