package com.Recursion;

public class PrintingNumbers{
    public static void main(String[] args) {
       nums(5);
    }

    static void nums(int x){
        if(x == 0){
            return;
        }
        //System.out.println(x);
        nums(x-1);
        System.out.println(x);


    }
}