package com.geekForGeeksDSCourse.ch2Mathematics;

public class P2Palindrome {
    public static void main(String[] args) {
        final Integer input = 212;
        System.out.println(new P2Solver().isPalindrome(input));

        //Solved for both negative and postive numbers
        //Time complexity is theta(d) where d is the number of digits in the number

    }
}

class P2Solver{
    public Boolean isPalindrome(Integer num){

        int temp = num<0 ? num*-1 : num ;
        int retainedNumber = temp;


        int reverse = 0; int digit = 0;
        //Approach

        //1. create a variable called reverse and initialize it to 0
        while(temp>0){
            digit = temp%10;
            reverse = reverse * 10 + digit;
            temp/=10;
        }

        System.out.println(reverse);

        //2. create a while loop and run it till num > 0 and perform 2 operations on it in every iteration
        //3. First iteration is to take the modulus by 10 and store the value in num with a formula

        //4. Second iteration is to divide the num by 10

        return retainedNumber==reverse;
    }
}
