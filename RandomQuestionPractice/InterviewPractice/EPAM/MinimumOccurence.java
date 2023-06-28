package com.geekForGeeksDSCourse.RandomQuestionPractice.InterviewPractice.EPAM;

import java.util.HashMap;

public class MinimumOccurence {
    public static void main(String[] args) {
        Character res = qSolver("cafdadccccdabbbbbd");
        System.out.println(res);
    }

    public static Character qSolver(String s) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            hs.computeIfPresent(charArray[i],(key, oldValue)-> ++oldValue);
            hs.computeIfAbsent(charArray[i],(k)->1);
        }

//        }  for (int i = 0; i < charArray.length; i++) {
//            if (hs.containsKey(charArray[i])) {
//                int value = hs.get(charArray[i]);
//                hs.put(charArray[i], ++value);
//            } else {
//                hs.put(charArray[i], 1);
//            }
//        }
        Integer min = Integer.MAX_VALUE;
        Character c = ' ';


        for(int i=0; i<charArray.length; i++){
            if(hs.get(charArray[i]) < min){
                min = hs.get(charArray[i]);
                c = charArray[i];
            }
        }

        System.out.println(hs.toString());
        System.out.println(min);

        return c;
    }
}
