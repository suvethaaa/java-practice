package com.Recursion;
//learning how function call  works i.e the stack memory and the function calls
//Every function in the stack memory is currently ongoing
//when a function finishes ongoing it will be removed from the stack and the program will be restored to the
//state where the function was called
//why recursion ? look down the repetition of program
public class NumbersExample {
    public static void main(String[] args) {
        number1(1);
    }

    static void number1(int n){
        System.out.println(n);
        number2(2 );
    }
    static void number2(int n){
        System.out.println(n);
        number3(3);
    }
    static void number3(int n){
        System.out.println(n);
        number4(4);
    }
    static void number4(int n){
        System.out.println(n);
        number5(5);
    }
    static void number5(int n){
        System.out.println(n);
    }


}