package com.suve;

public class LsReturnTrueOrFalse {
    public static void main(String[] args) {
      int[] nums = { 1 , 2 , 3 , 4};
      int target = 9;
        System.out.println(linearSearch(nums,target));
    }

    static boolean linearSearch(int[] arr , int target){
        if(arr.length==0){
            return false;
        }

        for(int num : arr){
            if(num == target){
                return true ;
            }
        }
        return false;

    }
}