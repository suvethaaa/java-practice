package com.suve;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3,5},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for(int[] person : accounts){
            int sum = 0 ;
            for( int account : person){
                 sum += account;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}