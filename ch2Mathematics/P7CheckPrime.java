package com.geekForGeeksDSCourse.ch2Mathematics;

public class P7CheckPrime {
    public static void main(String[] args) {
        Integer input = 239;
        System.out.println(new P7Solver().isPrime(input));
        System.out.println(new P7Solver().isPrimeOptimized(input));


        /*
        Was able to do the solution in O(Sqrt(n)) time complexity but this solution can be further optimized
        We can add divisibility checks by 2 and 3 and also we can increment i by 6 starting the i with 5 as 2 and 3 are
        already checked and 4 is divisible by 2
         */
    }
}

class P7Solver {
    public Boolean isPrime(Integer num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Boolean isPrimeOptimized(Integer num) {
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}

