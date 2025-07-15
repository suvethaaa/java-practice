package com.Problems;
import java.util.Scanner ;


public class CruiseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] entry = new int[n];
        int[] leaving = new int[n];

        for (int i = 0; i < n; i++) {
            entry[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            leaving[i] = scan.nextInt();
        }

        int max = 0;
        int people = 0;

        for (int i = 0; i < n; i++) {
            people += entry[i] - leaving[i];
            if(people > max){
                max = people;
            }
        }

        System.out.println(max);

    }
}