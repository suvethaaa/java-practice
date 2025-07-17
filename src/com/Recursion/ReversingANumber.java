package com.Recursion;

public class ReversingANumber {
    public static void main(String[] args) {
        System.out.println(rev2(1234));
        System.out.println(palindrome(4125214));

    }
//    static int sum = 0;
//    //division goes in the recursion
//    static void  Reverse(int x){
//
//        if(x==0){
//            return;
//        }
//        int rem = x % 10;
//        sum = sum * 10 + rem;
//        Reverse(x/10);
//    }

    static int rev2(int n){
        //sometimes you might need some additional variables inn the argument
        //in that case , make another function
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1) ;
    }

    static boolean palindrome(int n) {
        return n == rev2(n);
    }
}