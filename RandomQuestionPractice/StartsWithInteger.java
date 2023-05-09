package com.geekForGeeksDSCourse.RandomQuestionPractice;

import java.util.*;
import java.util.stream.Collectors;

public class StartsWithInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(123, 234, 5345, 1, 12, 2346);

        //Now using the lambda we have to find the numbers that starts with 1

        List<Integer> newList = list.stream().filter(i -> String.valueOf(i).startsWith("1")).collect(Collectors.toList());
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedListDesc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //Similarly we can also reverse the list


        List<Integer> reverseList = list.stream().map((num)-> {
            int rev =0;

            while(num!=0){
                int digit = num%10;
                rev = rev * 10 + digit;
                num/=10;
            }
            return rev;
        }).collect(Collectors.toList());

        System.out.println(newList);
        System.out.println(reverseList);
        System.out.println(sortedList);
        System.out.println(sortedListDesc);
    }
}
