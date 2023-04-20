package com.geekForGeeksDSCourse.ch3BitMagic.problems;

public class V5NOTandSHIFTOperators {

    private static final int x=-5;

    public static void main(String[] args) {
        System.out.println(new V5Solver().solveNot(x));
        /*
         In the NOT operator we perform this operation using the tilde sign
         How this operates is as follows
         1. NOT bitwise operator is not compatible with the boolean values.
         2. It works only with the integer values.
         In this since the int data type is of 4 bytes and 4 bytes have 32 bits,
         then the first bit is reserved for the sign of the value.
         If it is zero then it represents a positive number and if it is 1 then it represents a negative number
         So when we are negating a number, we are first going to negate all the bits of the number...

            Eg: 4= 0100
            But in 32 bit notation it is:
        4 =        0000 0000 0000 0000 0000 0000 0000 0100
       ~4 =        1111 1111 1111 1111 1111 1111 1111 1011

       Now the first bit is telling that the number is negative and the 2s complement of the
       remaining 31 bits are telling the value.

       To find the 2s complement we first compliment each bit and then add 1 to it.
                   -000 0000 0000 0000 0000 0000 0000 0100
                   -000 0000 0000 0000 0000 0000 0000 0101

                   This number is -5 and it is the output


         */

    }
}
class V5Solver{
    public static int solveNot(int x){
        return ~x;
    }
}
