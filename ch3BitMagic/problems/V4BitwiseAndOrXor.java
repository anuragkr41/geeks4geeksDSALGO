package com.geekForGeeksDSCourse.ch3BitMagic.problems;

public class V4BitwiseAndOrXor {
    private final static int x = 3;
    private static final int y = 6;

    public static void main(String[] args) {
        System.out.println(V4Solver.solveAND(x, y));
        /*
        Our objective is to find the bitwise AND of two numbers. For this ex we have x=3 and y=6
        In their binary represenation:

                        x=000000011
                        y=000000110
                        ------------
        Logical And =     000000010
        This is done by checking if both the binary bits are 1
        In our example we have got only 1 digit which results in 2
        The symbol for doing this operation is '&'



         */

        System.out.println(V4Solver.solveOR(x,y));

        /*
        Similiarly we have Or which is again a bitwise operator and works as the same way
        For x=3 and y=6 we have
                            x=00000000011
                            y=00000000110
                            -------------
                              00000000111
                              This number represent 7 in decimal system
         */

        System.out.println(V4Solver.solveXOR(x,y));

        /*
        This XOR is also called the exculsive OR where in the bit is set to one only when
        2 values are different. In case there are two ones or two zeros then the value
        of the bit will be set to zero

                            x=00000000011
                            y=00000000110
                            -------------
                              00000000101
                              This number represent 5 in decimal system
         */

    }
}

class V4Solver {
    public static int solveAND(int x, int y) {

        return x&y;
    }

    public static int solveOR(int x, int y){
        return x|y;
    }


    public static int solveXOR(int x, int y) {
        return x^y;
    }
}
