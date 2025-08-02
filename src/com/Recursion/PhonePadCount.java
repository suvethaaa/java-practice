package com.Recursion;

import java.util.ArrayList;

public class PhonePadCount {
    public static void main(String[] args) {
        int ans = phonePadCount("","23");
        System.out.println(ans);
    }

    static int phonePadCount(String p , String up){

        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) -'0';
        int count = 0;

        for (int i = (digit -1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i );

            count+=phonePadCount(p + ch , up.substring(1));

        }
        return count;
    }
}