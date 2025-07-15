package com.Problems;

import java.util.*;

public class MedianInSortedMatrix {
    public static int countLessEqual(int[] row, int target) {
        int low = 0, high = row.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    public static int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        int desired = (rows * cols + 1) / 2;

        while (low < high) {
            int mid = (low + high) / 2;
            int count = 0;

            for (int[] row : matrix) {
                count += countLessEqual(row, mid);
            }

            if (count < desired) low = mid + 1;
            else high = mid;
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        System.out.println("Median is: " + findMedian(matrix));
    }
}
