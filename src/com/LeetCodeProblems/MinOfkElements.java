package com.LeetCodeProblems;

import java.util.*;
class MinOfkElements {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5,9},
                {10,11,13},
                {12,13,15}
        };
        System.out.println(kthSmallest(arr,8));
    }
    static int kthSmallest(int[][] matrix, int k) {
        List<Integer> elements = new ArrayList<>();
        for(int i = 0 ; i < matrix.length -1 ; i++){
            for(int j = 0 ; j < matrix[i].length -1 ; j++){
                elements.add(matrix[i][j]);
            }
        }
        if(elements.size()>1){
            return elements.get(k-1);
        }else{
            return -1;
        }
    }
}