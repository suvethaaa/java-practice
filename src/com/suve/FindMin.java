package com.suve;

public class FindMin{
    public static void main(String[] args) {
       int[] arr = {3 , 4 , 5 , 6 , 7 };
        System.out.println(min(arr));

    }
    //Assume that is not a empty String
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}