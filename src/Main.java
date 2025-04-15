import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a character : ");
        char ch = scan.next().trim().charAt(0);

        if( ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
}