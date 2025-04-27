package com.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {2 , 7 , 7 , 7 , 7, 8 , 9};
        int target = 7;
        System.out.println(Arrays.toString(SearchRange(arr, target)));
    }

    static int[] SearchRange(int[] arr , int target){
        int[] ans = {-1,-1};
        //returns the index of first occurrence
        int start = search(arr,target,true);
        //returns the index of last occurrence
        int end = search(arr,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    static int search(int[] nums , int target , boolean findStartIndex){
        int ans= -1;
        int start = 0 ;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;

            if(target<nums[mid]){
                end = mid -1 ;
            } else if ( target > nums[mid]){
                start = mid+1;
            } else {
                //potential output
                ans = mid;
                if(findStartIndex){
                    end = mid -1 ;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}