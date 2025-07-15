package com.NumberSystem;

public class NumberSystemManual {

    // 1. Decimal to Binary
    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        return binary.equals("") ? "0" : binary;
    }

    // 2. Decimal to Octal
    public static String decimalToOctal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }
        return octal.equals("") ? "0" : octal;
    }

    // 3. Decimal to Hexadecimal
    public static String decimalToHex(int decimal) {
        String hex = "";
        char[] hexChars = "0123456789ABCDEF".toCharArray();
        while (decimal > 0) {
            int rem = decimal % 16;
            hex = hexChars[rem] + hex;
            decimal /= 16;
        }
        return hex.equals("") ? "0" : hex;
    }

    // 4. Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power++);
        }
        return decimal;
    }

    // 5. Octal to Decimal
    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int power = 0;
        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            decimal += digit * Math.pow(8, power++);
        }
        return decimal;
    }

    // 6. Hexadecimal to Decimal
    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int power = 0;
        hex = hex.toUpperCase();
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value = (ch >= '0' && ch <= '9') ? (ch - '0') : (ch - 'A' + 10);
            decimal += value * Math.pow(16, power++);
        }
        return decimal;
    }

    // 7. Binary to Hexadecimal
    public static String binaryToHex(String binary) {
        int decimal = binaryToDecimal(binary);
        return decimalToHex(decimal);
    }

    // 8. Hexadecimal to Binary
    public static String hexToBinary(String hex) {
        int decimal = hexToDecimal(hex);
        return decimalToBinary(decimal);
    }

    public static void main(String[] args) {
        int decimal = 26;
        String binary = "11010";
        String octal = "32";
        String hex = "1A";

        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println("Decimal to Octal: " + decimalToOctal(decimal));
        System.out.println("Decimal to Hex: " + decimalToHex(decimal));
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
        System.out.println("Octal to Decimal: " + octalToDecimal(octal));
        System.out.println("Hex to Decimal: " + hexToDecimal(hex));
        System.out.println("Binary to Hex: " + binaryToHex(binary));
        System.out.println("Hex to Binary: " + hexToBinary(hex));
    }
}
