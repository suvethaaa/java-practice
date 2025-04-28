package com.BinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3 ;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr , int target){
        int peak = peak(arr);
        int ans = binarySearch(arr,target,0,peak);
        if(ans != -1){
            return ans;
        }else{
            ans = binarySearch(arr,target,peak+1,arr.length-1);
        }
        return ans;
    }

    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr , int target, int start , int end){

        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if(target<arr[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
