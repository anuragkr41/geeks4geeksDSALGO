package com.geekForGeeksDSCourse.ch2Mathematics;

import java.util.ArrayList;

public class P4HCF {
    public static void main(String[] args) {
        final Integer number1 = 120;
        final Integer number2 = 180;
        System.out.println("Answer: "+new P4Solver().hfc(number1, number2));
        System.out.println("Anser via EM "+ new P4Solver().eulerMethodGCD(number1, number2));

        

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
        // For this we have an approach that the gcd is equal to the GCD of a, b-a
        /*
        This approach decreases the time complexity
        But now we have one more optimized way through recursioin in which what we will do is recursively call the GCD
        If the b is greater then the number will swap the position else the number will reurn the division

         */

        if(num2==0){
            return num1;
        }else {
            return eulerMethodGCD(num2, num1%num2);

        }

    }
}

class Test{
    private int age=40;
}
