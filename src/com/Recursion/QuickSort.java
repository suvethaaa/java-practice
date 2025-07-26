package com.Recursion;

import java.util.*;
public  class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quick(int[] arr , int low , int hi){

        if (low >= hi){
            return ;
        }

        int s = low;
        int e  = hi;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s <= e){
            // why if its already sorted and it will not swap
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){

                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index now need to sort the two halves
        quick(arr,low,e);
        quick(arr,s,hi);
    }
}