package com.sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
         int i = 0;
         while( i<nums.length){
             int correctIndex = nums[i]-1;
             if(nums[i]>0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                 swap(nums,i,correctIndex);
             }else{
                 i++;
             }
         }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return -1;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}