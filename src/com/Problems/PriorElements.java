package com.Problems;

import java.util.Scanner;

public class PriorElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 1 ;

        for (int i = 0; i < n; i++) {
            if(arr[i] > arr[0]){
                count++;
            }
        }

        System.out.println(count);
    }
}