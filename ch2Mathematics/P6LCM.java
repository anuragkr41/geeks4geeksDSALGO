package com.geekForGeeksDSCourse.ch2Mathematics;

public class P6LCM {
    public static void main(String[] args) {
        Integer number1 = 12;
        Integer number2 = 15;
        System.out.println(new P6Solver().solveLCM(number1, number2));

        // I was able to solve this using the while loop by iterating and increasing the number.
    }
}

class P6Solver {
    public int solveLCM(Integer num1, Integer num2) {

        /*
        Approach the LCM is the least number which is divisible by both the numbers
        For this we will go with the naive approach.
        We will run a loop starting from i= 1 to n and whatever number of i divides the num1 or num2 or both then we perform division
        and we multiply the result with itself...
         */


        int lcm = Math.max(num1, num2);
        while (!(lcm % num1 == 0 && lcm % num2 == 0)) {
            lcm++;
        }

        return lcm;
    }
}
