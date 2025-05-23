package com.BinarySearch;

public class RotateBinarySearch {
    public static void main(String[] args) {

        int[] arr ={4,5,6,7,0,1,2};
        int target = 0 ;
        System.out.println(SearchIndex(arr,target));

    }

    static int SearchIndex(int[] arr , int target){

        int pivot = pivot(arr);

        if(pivot == -1){
            return BinarySearch(arr,target,0, arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }


        if(target >= arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        return BinarySearch(arr,target,pivot+1,arr.length-1);
    }

    static int BinarySearch(int[] arr , int target , int start , int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(  mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[mid]<arr[start]){
                end = mid-1;
            }else{
                start = mid + 1;
            }
        }
        return -1 ;
    }
}