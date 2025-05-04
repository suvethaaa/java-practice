package com.Strings;

import java.util.Scanner;

public class PrintAscii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        String ch = scan.next();
        System.out.println((int) (ch.charAt(0)));
    }
}