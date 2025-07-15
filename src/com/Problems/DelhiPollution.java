package com.Problems;
import java.util.Scanner;

public class DelhiPollution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]  reg = new int[n];
        for (int i = 0; i < reg.length; i++) {
            reg[i]=scan.nextInt();
        }
        int date = scan.nextInt();
        int fine = scan.nextInt();
        System.out.println(fineAmount(n,reg,date,fine));
    }

    static int fineAmount(int n, int[] reg, int date, int fine) {

        int fineAmount = 0;
        if(date % 2 == 0){
            for (int i = 0; i < n; i++) {
                if(reg[i]%2 == 1){
                    fineAmount+=fine;
                }
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(reg[i]%2 == 0){
                    fineAmount+=fine;
                }
            }
        }
        return fineAmount;

    }
}