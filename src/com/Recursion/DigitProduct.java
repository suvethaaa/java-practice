package com.Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(POD(1342));
    }

    static int POD(int x){
        if(x == 0){
            return 1;
        }

        return x % 10 * POD(x / 10);
    }
}