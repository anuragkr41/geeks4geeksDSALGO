package com.geekForGeeksDSCourse.ch2Mathematics;

import static com.geekForGeeksDSCourse.ch2Mathematics.P9Solver.allDivisorsNaive;

public class P9AllDivisors {
    private static int input = 25;

    // With the naive approach it was too easy to solve
    public static void main(String[] args) {
       // P9Solver.allDivisorsNaive(input);
        P9Solver.allDivisorsOptimised(input);
    }
}

class P9Solver {
    public static void allDivisorsNaive(int num) {

        /*
        For the naive approach what we are going to do is that we will run the loop from 1 to n and if the number
        is divisible then we will print it straight away. This will take the time complexity of (O)n
         */

        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                System.out.println(i);
            }
        }
    }

    public static void allDivisorsOptimised(int num){
        /*
        For the optimised approach the tutor is emphasising on the fact that divisors of a number always appear in pairs

        For eg for input 30 we will have (1, 30), (2,15), (3,10),(5,6)

        Secondly, One of the divisors in every pair is smaller than or equal to square root of n

        So, for pair (x,y)
            x X y = n
            Let, x be the smaller , i.e. , x<=y
            x X x <=n
            x<=square root (n)
            hence we have to run the loop till n.

         */

        int i;
        for(i=1; i*i<=num; i++){
            if (num%i ==0){
                System.out.println(i);
            }
        }

        for(; i>=1 ;i--){
            if (num%i == 0){
                System.out.println(num/i);
            }
        }


    }

}
