package com.Problems;
import java.util.Scanner;

public class MysteriousReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int r = scan.nextInt();
        int m=n;
        int sum = 0;
        for (int i = 0; i < r; m+=n)  {

            while (m > 0) {
                sum += m % 10;
                m /= 10;
            }
            r--;
        }
        int ans =0;
        while(sum>0){
            ans = ans+sum%10;
            sum/=10;
        }
        System.out.println(ans);
    }
}