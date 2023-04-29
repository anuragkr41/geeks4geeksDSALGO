package com.geekForGeeksDSCourse.RandomQuestionPractice.Java8FeaturesDurga;

public class LambdaExpression {
    /*
        The main objective of Lambda Expression is to bring benefits of functinoal programming into java

        What is Lambda Expression?
        It is anonymous function which means
            1. Without name
            2. Without return type
            3. Without modifiers

        It is a very very very easy concept if you learn it properly
        _______________________________________________________________

        How to write lambda expression?
        If we remove the name, return type and the modifier then we convey our program that it is a lambda expression by using
        the arrow symbol

        BEFORE LAMBDA
        public void method(){
            System.out.println("Hello");
        }

        After lambda the same expression can be used like this

        ()->System.out.println("Hello")

        (int a,int  b) -> System.out.println(a+b);
        Compiler can also sometimes guess the parameter type then we can also remove both the parameter types

        n-> n*n;>

        for ----
        public int m1(String s){
            return s.length();
        }
        Using lambda s -> s.length;
        -------------------------------------------------
        How to call the lambda expression?
        It is by using the Functional Interface...

        Some common Functional Interfaces are
        Runnable, Comparable, CompareTo, ActionListener, Callable

        Functional Interface contain only one method...
        Runnable==> run()
        Comparable==> compareTo()
        Comparator => compare()>>>>
        ActionListener==> actionPerformed()
        Callable ==> call()

        SAM - They contain only Single Abstract Method
        You can also take default methods and static mehtods in Functioinal interface also...

        We have the @FunctionalInterface to tell the compiler that if there is any mistake while writing the functional interface
        then we are thrown an error

        Compulsarily the Functional interface must have one abstract method only and default and static method can also exist but
        the SAM shoould be present or else it will throw error.
        You can take any number of default methods and any number of static method but only one SAM




        If you want to invoke the lambda expression then you have to inoke the Functional interface

        @FunctionalInterface
        Interface A{
        public void m1();
        }

        @FunctionalInterface
        interface B extends A{

        }

        This is also valid...

        @FunctionalInterface
        Interface A{
        public void m1();
        }

        @FunctionalInterface
        interface B extends A{

           public void m1();
        }

        This is also valid... Until you are defining a new abstract method, then it is valid

        Lambda expression is a common concept that is used and people who are not using it are those who
        don't understand the concept very well.
















         */

    public static void main(String[] args) {


        Interf i2 = n -> n*n;
        System.out.println(i2.squareIt(6));


    }
}

@FunctionalInterface
interface Interf{
    public int squareIt(int n);
}

//This is old way of implementing the interface. If we go with lambda expression, then we can remove this altogether.
//class Demo implements Interf{
//
//    @Override
//    public int squareIt(int n) {
//        return n*n;
//    }
//}

