package com.geekForGeeksDSCourse.ch2Mathematics;

public class P1CountDigits {
    public static void main(String[] args) {
        final int input = -23;
        System.out.println(new P1Solver().solve(input));

        //Output Ok
        //Complexity: Theta(d) where d is the number of digits in the number

    }

}

class P1Solver{
    public Integer solve(int num){
        int count = 0;
        if (num<0) num*=-1;

        //Approach
        //1. Initialise the count variable to 0
        //2. Run a while loop and take the modulus of the number and increment to 1
        //3. Divide the number by 10
        int temp;

        while (num >0){

            num /=10;
            count++;
        }

        return count;
    }

}
