package com.suve;

public class FindMinTD {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5},
                {6,7}
        } ;
        System.out.println(linearSearchMin(arr));
    }

    static int linearSearchMin(int[][] arr){

        int min = Integer.MAX_VALUE;
        for(int[] ints : arr){
            for(int element : ints){
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }
}