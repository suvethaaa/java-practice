import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of integers you wanted to be in that array : ");
        int n = scan.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter the elements !");

//

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter the " + i +" element");
            arr[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));
//        for(int ar : arr){
//            System.out.println(ar);
//        }
    }
}