package com.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(SOD(1342));
    }

    static int SOD(int x){
        if(x == 0){
            return 0;
        }
        return (x%10) + SOD(x/10);
    }
}