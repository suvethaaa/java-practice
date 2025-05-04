package com.sorting;

public class FindDuplicate {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;

            if(nums[i] <= nums.length && nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else if(nums[i] <= nums.length && nums[i] == nums[correctIndex] && i != correctIndex){
                return nums[i];
            }else{
                i++;
            }
        }
        return nums[nums.length-1];
    }

    void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}