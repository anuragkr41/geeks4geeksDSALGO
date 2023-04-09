package com.geekForGeeksDSCourse.ch2Mathematics;

public class P11ComputePower {

    private static final int number = 3;
    private static final int power = 6;

    public static void main(String[] args) {
        System.out.println(new P11Solver().solveIterativeNaive(number, power));
        // I was able to solve on my own the iterative naive solution with 50% accuracy. Time complexity is theta(n)

        System.out.println("In Time compplexity theta(logN) " + new P11Solver().solveRescursion(number, power));
        System.out.println("In Time compplexity theta(logN) " + new P11Solver().solveIterativeAdvance(number, power));
        //Although the code for this last function I have written still the code is not 100% clear to me.
        // But I will check this back later.

    }
}

class P11Solver {
    public static int solveIterativeNaive(int num, int pow) {
        /*
        Apprroach to the given problem
        1. We are going to take a variable result and inititalize it to 1;
        2. We will run a for loop from 1 to pow and keep multiplying num to result
         */

        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= num;
        }
        return result;
    }

    public static int solveRescursion(int num, int pow) {
        /*

         Approach...
         We are going to store the value of this in a temp variable and it will keep multiplying...
         We also would be checking for the condition if n is even or odd.
         Our base case would be to check if pow == 0 and if it is then we will return 1; and in the subsequent steps we will be decreasing the value of pow by 2

         */

        //Base Case

        if (pow == 0) {
            return 1;
        }

        int temp = solveRescursion(num, pow / 2);
        // Here the important step is to multiply temp with temp because,
        // we have been using the concept that (x^n) = (x^n/2) * (x^n/2).
        // The idea behind this approach is that we wil have to calculate only till n/2 keep dividing it that way.
        // So this brings the complexity to logN
        // Now we will multiply the 2 temps
        // The problem with this approach is that it is using the recursion and so it will use function call stack to store the values.
        //  So it will also take the auxillary space of log n...
        //

        temp = temp * temp;

        if (pow % 2 == 0) {
            return temp;
        } else {
            return temp * num;
        }


    }

    public static int solveIterativeAdvance(int x, int n) {
        // We have the problem of space complexity in the previous method hence we are going to reduce the space
        // complexity to O(1)


        /*
        The idea for this approch is that we have to convert the number into the binary implementation and write down
        the number in the form of powers
        For Ex, 3^19 can be written as  3^16  * 3^2 *  3^1   Hence 19 can be written as 10011
        For eg 3^27 can be written as 3^16 * 3^8 * 3^2 * 3^1 Hence 27 can be written as 11011
         */
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0)
                res *= x;
            x=x*x;
            n=n/2;
        }
        return res;
    }
}
