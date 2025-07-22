package com.Recursion;

import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr = {5,4,3,4,5};

        System.out.println(pivotIndex(arr));
    }

    static int pivotIndex(int[] nums) {

        for(int i = 1 ; i < nums.length ; i++){
            int a  = 0;
            for(int j = 0 ; j < i ; j++){
                a+=nums[j];
            }
            int b = 0;
            for(int j = i+1 ; j < nums.length ; j++){
                b+=nums[j];
            }
            if(a == b){
                return nums[i];
            }
        }
        return -1;
    }
    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left , int[] right){
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is incomplete

        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[i];
            j++;
            k++;
        }
        return mix;
    }
}