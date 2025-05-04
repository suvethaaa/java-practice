package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndAllTheDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(disappearedElements(arr));
    }

    static List<Integer> disappearedElements(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        List<Integer> missingValue = new ArrayList<Integer>();
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                missingValue.add(index+1);
            }
        }
        return missingValue;
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}