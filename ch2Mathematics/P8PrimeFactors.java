package com.geekForGeeksDSCourse.ch2Mathematics;

import java.util.ArrayList;
import java.util.Arrays;

public class P8PrimeFactors {
    private static int input= 315;

    public static void main(String[] args) {

       // System.out.println(new P8Solver().primeFactors(input));
        // I was able to solve this using the naive approach in O(n) time complexity
        new P8Solver().optimisedPrimeFactors(input);

    }

}
 class P8Solver{
    public ArrayList<Integer> primeFactors(int num){

        ArrayList<Integer> arr = new ArrayList<>();

        /*
        We are first going to try the naive method in which we will keep dividing the nubmer by i and unitl
        num%i !=0 the i will not increment and if it is zero we update the num by dividing it with i and so on we will continute
        We can run this loop from 2 to square root of n
         */

        for (int i = 2; i<=num ;){
            if (num%i==0){
                arr.add(i);
                num/=i;
            }else {
                i++;
            }
        }
        //System.out.println(arr);
        return arr;
    }

    // This solution is developed by peeking into the algo from GFG
     public void optimisedPrimeFactors(int n) {
        /*
        In this approach what we will do is that we are going to check explicitly for divisibility by 2 and 3
        and we will be checking till square root of n and
         */

         if (n<=1) return;

         while (n%2 == 0 ){
             System.out.println(2);
             n/=2;
         }while (n%3 == 0 ){
             System.out.println(3);
             n/=3;
         }
         for(int i = 5; i*i<=n; i=i+5){
             while(n%i==0){
                 System.out.println(i);
                 n/=i;
             } while(n%(i+2)==0){
                 System.out.println(i+2);
                 n/=i+2;
             }
         }
         if(n>3){
             System.out.println(n);
         }

     }
 }