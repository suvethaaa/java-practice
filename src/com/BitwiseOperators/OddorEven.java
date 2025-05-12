package com.BitwiseOperators;

public class OddorEven {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isOdd(n));
    }
    // the only bit determines whether  it is an odd or even is the least significant bit and if it is one then
    //the number is odd if its 1 the number is even if its zero
    //& --> bitwise operator
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}