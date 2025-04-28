package com.BinarySearch;

public class MountainIndex {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peak(arr));
    }

    static int peak(int[] arr){
        int start = 0 ;
        int end = arr.length;

        while (start<end){
            int mid = start+(end-start)/2;
            // we are using the greater than comparison for time complexity that we do not know the array length
            if(arr[mid]>arr[mid+1]){
                end = mid ;
            }else{
                start = mid +1 ;
            }
        }
        return start;
    }
}