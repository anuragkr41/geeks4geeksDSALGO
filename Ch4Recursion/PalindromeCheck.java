package com.geekForGeeksDSCourse.Ch4Recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str="abbad";
        int start=0, end=str.length()-1;

        System.out.println(isPalindrome(str, start, end));
    }
    public static boolean isPalindrome(String str, int start, int end){
        if(start>=end)
            return true;
        return str.charAt(start)==str.charAt(end) && isPalindrome(str, start+1, end-1) ;

    }
}
