package com.Recursion;

public class Concepts {
    public static void main(String[] args) {
        concepts(5);
    }

    static void concepts(int x){
        if(x == 0){
            return;
        }

        System.out.println(x);
        concepts(--x);
    }
}