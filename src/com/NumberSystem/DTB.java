package com.NumberSystem;

public class DTB {
    public static void main(String[] args){
        int n= 13;
        System.out.println(dectobin(n));
    }

    static String dectobin(int decimal) {

            String binary = "";
            while (decimal > 0) {
                binary = (decimal % 2) + binary;
                decimal /= 2;
            }
            return binary.equals("") ? "0" : binary;

    }
}