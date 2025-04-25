package com.suve;

public class SearchInaRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3 ;
        System.out.println(linearSearch(arr,target,1 , 4));
    }

    static int linearSearch(int[] arr , int target , int start , int end){
        if(arr.length==0){
            return -1 ;
        }
        for(int i = start ; i < end ; i++){
            int element = arr[i];
            if(element== target){
                return i;
            }
        }
        return -1 ;
    }
}