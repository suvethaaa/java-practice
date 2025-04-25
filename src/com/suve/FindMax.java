package com.suve;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {3 , 4 , 5 , 6 , 7 };
        System.out.println(max(arr));
    }
    //Assume that the array is not empty
    static int max(int[] arr ){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}