import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check prime ");
        int n = scan.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if(n <= 1 ){
            return false;
        }
        int c = 2;
        while(c * c <= n){
            if(n % c == 0 ){
                return false ;
            }
            c++;

        }
        return c * c > n;
    }
}