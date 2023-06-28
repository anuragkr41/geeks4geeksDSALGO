package com.geekForGeeksDSCourse.RandomQuestionPractice.InterviewPractice.EPAM;

public class PasswordAscII {
    public static void main(String[] args) {
        String res = password("796115110113721110141108");
        System.out.println(res);

    }

    public static String password(String s){

        char[] array = s.toCharArray();
        String current = "";
        String result = "";

        for(int i=array.length; i>=0; i=i-2){

            current="";
            current = ""+array[i]+ array[i-1];
            int n = Integer.parseInt(current);

            if (n==32){
                result += " ";
            } else if ((n>=65 && n<=90) || (n>=97 && n<=122)   ) {
                result+= (char)n;

            }


        }

        return "d";

    }
}
