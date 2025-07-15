package com.Problems;

import java.util.Scanner;

public class Vehicles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int v = scan.nextInt();
        int w = scan.nextInt();

        int tw = 0;
        int fw = 0;
        if (w >= 2 * v && (w - 2 * v) % 2 == 0) {

            fw = (w - 2 * v) / 2;
            tw = v - fw;
        }
        System.out.println("TW =" + tw + " FW =" + fw);
    }
}