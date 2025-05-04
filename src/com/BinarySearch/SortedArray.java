package com.BinarySearch;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        int target = 36 ;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] binarySearch(int[][] matrix , int target , int row , int cStart , int cEnd){

        while (cStart<=cEnd){
            int mid = cStart+(cEnd-cStart)/2;

            if(matrix[row][mid] == target){
                return new int[] {row,mid};
            }else if(matrix[row][mid] < target){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix , int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows==0){
            return binarySearch(matrix,target,0,0,cols -1);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = (cols-1)/2;

        while(rStart < (rEnd-1)){
            int rMid = rStart+(rEnd-rStart)/2;

            if(matrix[rMid][cMid]==target){
                return new int[]{rMid,cMid};
            }
            if(matrix[rMid][cMid]>target){
                rEnd = rMid;
            }else{
                rStart = rMid;
            }
        }

        if(target==matrix[rStart][cMid]){
            return new int[]{rStart,cMid};
        }
        if(target==matrix[rStart+1][cMid]){
            return new int[]{rStart+1,cMid};
        }

        if(target<matrix[rStart][cMid]){
            return binarySearch(matrix,target,rStart,0,cMid-1);
        }
        if(target>matrix[rStart][cMid]){
            return binarySearch(matrix,target,rStart,cMid+1,cols-1);
        }
        if(target<matrix[rStart+1][cMid]){
            return binarySearch(matrix,target,rStart+1,0,cMid-1);
        }
        if(target>matrix[rStart+1][cMid]){
            return binarySearch(matrix,target,rStart+1,cMid+1,cols-1);
        }



        return new int[] {-1,-1};
    }
}