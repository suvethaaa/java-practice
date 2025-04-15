import java.util.Scanner;

public class Methods{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        String personalised = MyGreet(name);
        System.out.println(personalised);
    }
     // passing String value


    private static String MyGreet(String name) {
        String message = "Hello "+ name;
        return message;
    }


//    static void sum(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number1 : ");
//        int a = scan.nextInt();
//        System.out.println("Enter a number2 : ");
//        int b = scan.nextInt();
//        int sum = a + b ;
//        System.out.println(sum);
//
//    }

    // return type int
//    static int sum1(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number1 : ");
//        int a = scan.nextInt();
//        System.out.println("Enter a number2 : ");
//        int b = scan.nextInt();
//        int sum = a + b ;
//        return sum;
//    }

    // return type String

//    static String greeting(){
//        String Greeting = "Hello world !";
//        return Greeting;
//    }

    // pass the value of numbers when calling the method in main

    static int sum(int a , int b){
        int sum = a + b ;
        return sum;
    }
}