package com.Problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class dynamicArray {
    public static void main(String[] args) {
        int[] arr = {1,8,4,2,4};


        System.out.println(maximumLength(arr));

    }
    static int maximumLength(int[] nums) {
        int[][] patterns = { {0,0} , {0,1} ,{1,0} ,{1,1}};
        int res = 0;

        for(int[] pattern : patterns){
            int cnt = 1;
            for(int num : nums){
                if(num % 2 == pattern[cnt%2]){
                    cnt++;
                }else{
                    cnt=1;
                }
            }
            res = Math.max(res,cnt);
        }
        return res;
    }
}