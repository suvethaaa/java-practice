package com.Problems;

import java.util.Arrays;

public class RiskSorter {
    public static void sortRisks(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: // low risk
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1: // medium risk
                    mid++;
                    break;
                case 2: // high risk
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Helper function to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] risks = {2, 0, 1, 2, 1, 0, 0, 2, 1};
        sortRisks(risks);
        System.out.println("Sorted risks: " + Arrays.toString(risks));
    }
}
