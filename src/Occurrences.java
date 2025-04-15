//counting the occurrences of a number

import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        System.out.println("Need which occurence ? ");
        int num = scan.nextInt();

        int count = 0;

        while( n > 0 ){

            int rem = n%10;
            if(rem == num ){
                count +=1;
            }
            n = n/10;

        }
        System.out.println(count);
    }
}