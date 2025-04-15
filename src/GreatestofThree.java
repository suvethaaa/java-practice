import java.util.*;
import java.lang.System;

public class GreatestofThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three number : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = Math.max(c,Math.max(a,b));

        System.out.println(max);
    }
}