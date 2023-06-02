package com.geekForGeeksDSCourse.Ch4Recursion;

public class V13SubString {
    public static void main(String[] args) {
        String input = "abc";
        subset(input, "", 0);

    }
    public static void subset(String s, String current, int i){

        if (s.length() ==i){
            System.out.println(current);
            return;
        }
        subset(s, current, i+1);
        subset(s, current+s.charAt(i), i+1);
    }
}
