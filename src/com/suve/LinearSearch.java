package com.suve;



public class LinearSearch{
    public static void main(String[] args) {
        int[] nums = {45 , 67 , 89, 56 , 34};
        int target = 129 ;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr , int target){
        if(arr.length == 0 ) return -1 ;

        for(int i = 0 ; i < arr.length ; i++){
            int el = arr[i];
            if(el == target ) return i ;
        }
        return -1 ;
    }
}