package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {2,0,2,1,1,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int lastIndex = arr.length - i - 1;
            int Max = max(arr,0,lastIndex);
            swap(arr,Max,lastIndex);
        }
    }

    static int max(int[]arr , int start , int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int max , int lastIndex){
        int temp = arr[max];
        arr[max] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}