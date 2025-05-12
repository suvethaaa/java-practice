package com.BitwiseOperators;

public class IthBitOfANumber {
    public static void main(String[] args) {
        int a = 16;
        int bit = 5;
        System.out.println(ans(a,bit));
    }
    // and the particular bit give me the same bit
    static int ans(int a , int bit){
        return a & (1 << (bit-1));
    }
}