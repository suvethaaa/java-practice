package com.suve;

public class LsReturnElement {
    public static void main(String[] args) {
      int[] nums = { 45 , 65 , 78 , 79 , 63};
      int target = -1 ;
      int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr , int  target){
        if(arr.length == 0){
            return Integer.MAX_VALUE ;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE ;
    }
}