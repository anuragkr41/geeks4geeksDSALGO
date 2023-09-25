package com.geekForGeeksDSCourse.Ch11Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class V5SubSequence {
    public static void main(String[] args) {
        String input = "ABCDE";
        String ss = "AED";
        System.out.println(checkSubSequence(input, ss));

    }

    public static boolean checkSubSequence(String str,String ss){
        boolean flag= true;
        int temp=0;

        ArrayList<Integer> indexes = new ArrayList<>();


        for(int i=0; i<ss.length(); i++){
            for(int j=0; j<str.length(); j++){

                if((ss.charAt(i)==str.charAt(j))){
                    indexes.add(j);
                    break;
                }
            }
        }



        for(Integer i : indexes){
            System.out.println(i);
        }
        return flag;
    }
}
