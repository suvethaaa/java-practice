package com.Problems;

import java.util.Arrays;

public class FIndEMpty {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, 1, 9, 0, 5, 0};
        System.out.println(Arrays.toString(empty(arr)));
    }

    static int[] empty(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {


            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}