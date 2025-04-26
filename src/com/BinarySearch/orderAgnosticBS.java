package com.BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {

        int[] nums = {22 , 21 , 19 , 18 , 17 , 16 , 10 };
        int target = 22;
        System.out.println(binarySearch(nums,target));

    }

    static int binarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length - 1;
        boolean isAsc = arr[start]<arr[end];
        //dont get confused that this while loop is running for the indices
        while(start <= end ){
            int mid = start + (end - start)/2 ;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else if(target > arr[mid]){
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}