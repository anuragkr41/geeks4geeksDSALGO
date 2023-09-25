package com.geekForGeeksDSCourse.Ch11Strings;

public class V1Frequency {
    public static void main(String[] args) {
        String input = "geekforgeeks";
        char[] arr = input.toCharArray();
        //We have to return the frequency of each letter that too in sorted alphabetical order

        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            count[arr[i] - (int) 'a']++;
        }

        for (int i = 0; i < 26 ; i++){
            if (count[i]>0){
                System.out.println((char) (97 + i) + " = " + count[i]);
            }
        }
    }
}
