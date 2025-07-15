package com.Problems;
import java.util.Scanner;

public class ValueOfaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int n = str.length();
        int count1 = 0; // count for star
        int count2 = 0 ; //count for hash
        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == '*'){
                count1++;
            }else{
                count2++;
            }
        }

        if(count1 > count2){
            System.out.println("positive integer");
        }else if(count1 < count2){
            System.out.println("negative integer");
        }else {
            System.out.println("0");
        }
    }
}