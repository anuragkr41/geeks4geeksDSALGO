package com.geekForGeeksDSCourse.ch2Mathematics;

public class P4HCF {
    public static void main(String[] args) {
        final Integer number1 = 120;
        final Integer number2 = 180;
        System.out.println("Answer: "+new P4Solver().hfc(number1, number2));

        // I was able to calculate the Gcd wit the time complexity of O(min(n,m))

    }
}
class P4Solver{
    public Integer hfc(Integer num1, Integer num2){
        /* Approach
        1. Initialize a variable gcd to 1 as one will always be the HCF in the worst case.
        2. Run a loop by checking the condition from 0 to square root of n
        */

        Integer gcd = 1;
        for ( int i = 1; i <= Math.min(num1, num2); i++ ){
            if (num1%i==0 && num2 %i==0) gcd=i;
            System.out.println(gcd);
        }
        return gcd;
    }

    public Integer eulerMethodGCD(Integer num1, Integer num2){
        // For this we have an approach that the gcd is equal to the
    }
}
