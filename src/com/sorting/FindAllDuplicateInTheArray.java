package com.sorting;
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateInTheArray {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<Integer>();
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        for(int index = 0 ; index <arr.length ; index++){
            if(arr[index] != (index+1)){
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}