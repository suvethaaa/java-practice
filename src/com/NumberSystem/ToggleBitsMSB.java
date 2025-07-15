package com.NumberSystem;

import java.util.Scanner;

public class ToggleBitsMSB {

    public static int toggleBitsFromMSB(int n) {

        int numBits = 0;
        int temp = n;
        while (temp > 0) {
            numBits++;
            temp >>= 1;
        }

        // Step 2: Create mask with all bits set to 1 (same length)
        int mask = (1 << numBits) - 1;

        // Step 3: XOR n with mask to toggle bits
        return n ^ mask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int result = toggleBitsFromMSB(n);
        System.out.println("Result after toggling bits from MSB: " + result);
    }


}
