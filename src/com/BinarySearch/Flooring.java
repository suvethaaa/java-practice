package com.BinarySearch;

public class Flooring {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(flooring(nums,target));
    }

    static int flooring(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        if(target<arr[0] || target>arr[end]){
            return -1;
        }
        while(start<=end){

            int mid= start+(end-start)/2;

            if(target<arr[mid]){
                end = mid -1 ;
            }else if(target>arr[mid]){
                start = mid +1;
            }else if(target == arr[mid]){
                return mid;
            }
        }

        return end;
    }
}