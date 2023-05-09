package com.geekForGeeksDSCourse.RandomQuestionPractice;

import java.util.HashMap;

public class Anagram {
    /*
    We have two strings and we have to check if the strings are anagram or not
     */

    private static final String str1 = "abcde";
    private static final String str2 = "wxyza";

    public static void main(String[] args) {
        System.out.println(new AnaSolver().isAnagram(str1, str2));


    }

}

class AnaSolver {
    public static boolean isAnagram(String s1, String s2) {
        /*
        Case 1 When the string lenth is unequal then we are going to
                return false immediately
         */
        if (s1.length() != s2.length()) return false;

        /*
            We will be having two cases
                a) Where the characters are unique
                b) Where the characters repeat

                If we go to solve the repeating character then the first case will be automatically handeled
                Let us use the map to contant the key value pair of key containing the character and values
                containing the frequency.


                This is having a simple algoritm.
                Here we have to just sort the two arrays






         */

        HashMap<Character, Integer> mapForS1 = new HashMap<>();
        HashMap<Character, Integer> mapForS2 = new HashMap<>();


        for (int i = 0; i < s1.length(); i++) {

            mapForS1.put(s1.charAt(i), mapForS1.getOrDefault(s1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {

            mapForS2.put(s2.charAt(i), mapForS2.getOrDefault(s2.charAt(i), 0) + 1);
        }

        //reps--;


        System.out.println(mapForS1);
        System.out.println(mapForS2);

        return mapForS1.equals(mapForS2);
    }
}
