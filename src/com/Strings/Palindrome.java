package com.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String a = "abcdcba";
        System.out.println(palindrome(a));

    }

    static boolean palindrome(String a ){
        for (int i = 0; i < a.length()/2; i++) {
            int start = i;
            int end = a.length()-1-i;
            if(a.charAt(start) != a.charAt(end)){
                return false ;
            }
        }
        return true;
    }
}