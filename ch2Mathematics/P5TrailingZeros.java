package com.geekForGeeksDSCourse.ch2Mathematics;

public class P5TrailingZeros {
    public static void main(String[] args) {

        Integer input = 10;
        System.out.println(new P5Solver().solve(input));

        //I was able to solve this using the O(n) complexity but a better solution is to just
        // return the division of the number by 5 which will take the O(1);
        // I have made the sure that the overflow issues is tackled in the problem

        /*
        My solution was wrong as I didn't considered the case that what will happen when n = 25 as there will be 2 5s available



        Going by the solution, we will check only the number of 5s available and if n is divisible by i

        Complexity is going to be Theta log(n)
         */




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
        for(int i =5; i <= num; i=i*5){
            count = count + num/i;
        }


        return count;
    }


}
