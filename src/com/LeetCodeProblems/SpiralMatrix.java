package com.LeetCodeProblems;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,10},
                {4,5,6,16},
                {7,8,80,9}
        };
        System.out.println(spiralOrder(arr));
    }
   static List<Integer> spiralOrder(int[][] matrix) {
       int rowStart = 0;
       int colStart = 0;
       int rowEnd = matrix.length - 1;
       int colEnd = matrix[0].length - 1;
       List<Integer> spiral = new ArrayList<>();

    while (rowStart <= rowEnd ){
        if(rowStart <= rowEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                spiral.add(matrix[rowStart][i]);
            }
        }
       rowStart++;
        if(colStart <= colEnd) {
            for (int i = rowStart; i <= rowEnd; i++) {
                spiral.add(matrix[i][colEnd]);

            }
        }
       colEnd--;
        if(rowStart <= rowEnd) {
            for (int i = colEnd; i >= colStart; i--) {
                spiral.add(matrix[rowEnd][i]);
            }
        }
       rowEnd--;
        if(colStart <= colEnd) {
            for (int i = rowEnd; i >= rowStart; i--) {
                spiral.add(matrix[i][colStart]);
            }
        }
       colStart++;
   }
        return spiral;
    }
}