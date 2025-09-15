package com.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(ceilingBS(nums,target));
    }

    static int ceilingBS(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;

        if(target>arr[end]){
            return end ;
        }
        if(target<arr[start]){
            return -1;
        }
        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return start;
    }
}