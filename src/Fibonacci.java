import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n ;
        System.out.println("Enter a number : ");
        n = scan.nextInt();
        int a = 0 ;
        int b = 1 ;
        int count = 2 ;

        while(count <= n ){
            int temp = b ;
            b += a ;
            a = temp;
            count ++ ;
        }
        System.out.println(b);
    }
}