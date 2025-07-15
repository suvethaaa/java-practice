package com.Problems;
import java.util.Scanner ;


public class LotSpace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] parking = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                parking[i][j] = scan.nextInt();
            }
        }

        int maxRow = 1;
        int count=0;
        int currentCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(parking[i][j] == 1){
                    currentCount++;
                }
            }
            if(currentCount > count){
                count = currentCount;
                maxRow = i+1;
            }

        }
        System.out.println(maxRow);

    }
}