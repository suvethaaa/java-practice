package com.Problems;
import java.util.Scanner;

public class RoundTable{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int ans = 2*factorial(n-1);
        System.out.println(ans);
    }

    static int factorial(int n){
        if(n<=1){
            return 1;
        }

        return n*factorial(n-1);
    }
}