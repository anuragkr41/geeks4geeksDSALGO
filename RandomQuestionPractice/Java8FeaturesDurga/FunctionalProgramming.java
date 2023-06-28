package com.geekForGeeksDSCourse.RandomQuestionPractice.Java8FeaturesDurga;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {
    public static void main(String[] args) {
        Function<Integer, Integer> f = i -> i * i; //Function
        System.out.println("The square of 50 is "+ f.apply(50));
        Predicate<Integer> p = i-> i%2==0;

        //This code below is for the predicate which is returns a boolean value\

        Predicate<Integer> poo = i->i%2==0;
        System.out.println(poo.test(23));
    }
}
