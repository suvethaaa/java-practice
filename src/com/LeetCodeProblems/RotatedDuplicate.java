package com.LeetCodeProblems;

public class RotatedDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,2,2,0,1};
        System.out.println(findMin(nums));
    }

        static int findMin(int[] nums) {
            int n = nums.length;
            int pivot = 0;
            if(n==1){
                return nums[0];
            }
            if(n > 1){
                pivot = pivot(nums);
            }
            if(pivot == -1){
                return nums[0];
            }
            if(pivot >= 0){
                return nums[pivot+1];
            }
            return -1;
        }

        static int pivot(int[] nums){
            int start = 0 ;
            int end = nums.length-1;

            while(start<end){
                int mid = start +(end - start)/2;

                if(mid < end && nums[mid] > nums[mid+1]){
                    return mid;
                }
                if(mid > start && nums[mid] < nums[mid-1]){
                    return mid -1;
                }
                if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                    if(nums[start] > nums[start+1]){
                        return start;
                    }
                    start++;
                    if(nums[end] < nums[end -1]){
                        return end-1;
                    }
                    end--;
                }
                if(nums[mid]>nums[start] || nums[start] == nums[mid] && nums[mid]>nums[end]){
                    start = mid+1;
                }
                else{
                    end = mid -1;
                }

            }
            return -1;
        }

}