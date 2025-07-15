package com.NumberSystem;

public class DTO {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(decimaltooctal(n));
    }

    static String decimaltooctal(int dec){

        String octal = "";


        while(dec > 0){
            octal = dec % 8 + octal;
            dec/=8;
        }
        return octal.isEmpty()?"0" : octal;
    }
}