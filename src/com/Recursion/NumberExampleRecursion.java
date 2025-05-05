package com.Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        numbers(1);
    }
    static void numbers(int n){
        //base condition in recursion : it is the condition where are recursion will stop making another calls
        //each call can be considered as a separate call in the stack memory
        //as per the times the function called it will be taking a separate memory
        //without base condition the function called again and again
        //the stack memory will be keep filled and every upstream function is waiting for the execution
        //it will stop when the memory exceeds the limit that error is known as stack overflow error
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n+1);
    }
}