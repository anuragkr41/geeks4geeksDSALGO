package com.geekForGeeksDSCourse.ch2Mathematics;

public class P3Factorial {
    public static void main(String[] args) {
        final Integer input = 5;
        System.out.println(new P3Solver().solveByIteration(input));
        //Solved Successfully and kept the iteration to O(n) as the loop is running n times

        System.out.println(new P3Solver().solveByRecursion(input));
        //Solved after peeking out the solution
        // Complexity of recursion is theta(n-1) + theta (1) but since it has a lot
        // of overheads, hence the iterative approach is considered better.

    }
}

class P3Solver {
    public Integer solveByIteration(Integer num) {
        //Approach
        /*
        1. We will check if the input is 0 or 1 and if thats the case then we will immediately return 1;
        2. We will create a variable called fact and initialize it to 1
        3. We will run a for loop starting from i =2 till n and keep multiplying the factorial by i
         */
        if (num == 0 || num == 1) return 1;

        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public Integer solveByRecursion(Integer num) {
        if(num == 0) return 1;
        return num * solveByRecursion(num-1);

    }
}