import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number to check prime ");
//        int n = scan.nextInt();
//        System.out.println(isArmstrong(n));
//        System.out.println(isPrime(n));

        for(int i = 100 ; i < 1000 ; i ++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
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

    static boolean isArmstrong(int n){
        int original = n ;
        int sum = 0 ;

        while(n > 0){
            int rem = n % 10 ;
            sum = sum + rem*rem*rem;
            n = n / 10;
        }
        return original==sum;
    }
}