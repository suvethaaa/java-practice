//Question find the nth fibonacci number
//tip to use recursion if they give like n numbers or something try to break it into the recursion
//comes via practice
//see if you can break the problem into smaller problems
//here the f(n) = f(n-1)+f(n-2) then f(n-1)=f(n-2)+f(n-3) and so on and that is known as recurrence relation
//when you write the formula for recursion then that is known as recurrence relation
//the base condition is represented by answers we already

package com.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }
    //it is fine until the number is too small even if its 50 or something it cant give output remember the tree
    //there is a repetition of leaf nodes even for 4 th number
    //so think there would be how many repetitions for number 50 too much right there comes the concept "dynamic
    //programming"


    static int fibonacci(int n){
        //base condition
        if(n<2){
            return n ;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}