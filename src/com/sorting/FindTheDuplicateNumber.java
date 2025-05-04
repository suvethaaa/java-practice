package com.sorting;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(duplicate(arr));
    }

    static int duplicate(int[] arr){
        int i = 0 ;
        while(i<arr.length){
            int correctIndex = arr[i]-1;

            if(arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
           if(arr[index] != index+1){
               return arr[index];
           }
        }

        return arr[arr.length-1];
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}