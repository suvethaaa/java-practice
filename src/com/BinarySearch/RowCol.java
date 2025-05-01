package com.BinarySearch;

import java.util.Arrays;

public class RowCol {
    public static void main(String[] args) {
        //this is the sol for arr having elements if we see row wise or col wise it is sorted but it does not
        //mean that the whole matrix is sorted for example row[2]col[3] contains 49 where row[3]col[2] contains 38
        //which is lesser than 49 even though it comes after 49.
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 6;
        System.out.println(Arrays.toString(matrixBinarySearch(arr, target)));
    }

    static int[] matrixBinarySearch(int[][] matrix , int target){
        //row and column will be pointing somewhere and there our target is
        int r = 0;
        int c = matrix.length-1;
        //you can run the loop if row is less that our length and col is 2greater then zero
        //that we will bw decreasing the col and increasing the roe that row should not exceed the length
        //and column should not exceed the 0 then loop do not break
        while(r < matrix.length && c >=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            if(target < matrix[r][c]){
                c--;
            }else{
                r++;
            }
        }

        return new int[] {-1,-1};

    }
}