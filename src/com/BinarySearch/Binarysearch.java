package com.BinarySearch;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 3;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid - 1 ;
            }else if(target>arr[mid]){
                start = mid + 1 ;
            }else{
                return mid ;
            }
        }
        return -1;
    }
}
//boolean consist(Arraylist<Integer> arr , int num){
//        boolean ans = true;
//
//        for(int i = 0 ; i < arr.size() ; i++){
//            if(arr[i] == num){
//                ans = false;
//            }
//        }
//
//        return ans;
//    }