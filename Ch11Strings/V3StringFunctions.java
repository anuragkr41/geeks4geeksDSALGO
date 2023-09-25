package com.geekForGeeksDSCourse.Ch11Strings;

public class V3StringFunctions {
    public static void main(String[] args) {
        String input = "geeks forg eeks";

        String s1 = " handi";

        input = input.concat("higon");


        System.out.println(input);

        System.out.println(input.contains("hih"));

        System.out.println(input.charAt(3));
        String[] res = input.split(" ");
        System.out.println(res.length);

        for (String s : res) {
            System.out.println(s);
        }

        System.out.println(s1.compareTo(input));

        System.out.println(input.indexOf("for"));
    }
}
