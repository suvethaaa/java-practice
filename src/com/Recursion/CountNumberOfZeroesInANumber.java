package com.Recursion;

public class CountNumberOfZeroesInANumber {
    public static void main(String[] args) {
        System.out.println(count(30008090));
    }
    ///  revise this example to understand how count works in recursion
    static int count(int n){
        return helper(n,0);
    }
    // use the helper function whenever you are having the doubt about passing which arguments in the method

    static int helper(int n , int c){
        if(n == 0 ){
            return c;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n / 10 , c + 1);

        }
        return helper(n / 10 , c);
    }

}