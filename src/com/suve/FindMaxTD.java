package com.suve;

public class FindMaxTD {
    public static void main(String[] args) {
       int[][] arr = {
               {1,2,3},
               {4,5},
               {6,7}
       } ;
        System.out.println(linearSearch(arr));
    }
    //Assuming the array is non empty
    static int linearSearch(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] arrs : arr){
            for(int arrr : arrs){
                if(arrr > max ){
                    max = arrr;
                }
            }
        }
        return max ;
    }
}