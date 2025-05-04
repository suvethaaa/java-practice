package com.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //finding the correct index of the value in the i
            int correctIndex = arr[i]-1;
            //it supposed to the value in i and value in correct index are equal if not the values gets changed if duplicates appear since
            //the values are sae they wil be ignored
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}