package com.Strings;

public class Performance {
    public static void main(String[] args) {
        String alpha = "";
        //Right down is the worst you can do to your memory because as we know that Strings are immutable
        //and for every loop you are creating a new object


//        for(int i = 0 ; i < 26 ; i++){
//            char ch = (char) ('a' + i);
//            alpha = alpha + ch;
//        }

        System.out.println(alpha);
    }
}