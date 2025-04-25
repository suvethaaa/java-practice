import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int[][] arr = new int[3][];
//
//        for(int i = 0 ; i < arr.length ;i++){
//            System.out.println("Enter the elements of "+ i + " row : ");
//            for( int j = 0 ; j < arr[i].length ; j++){
//                arr[i][j] = scan.nextInt();
//            }
//        }
//
//        for(int i = 0 ; i < arr.length; i++){
//            for(int j = 0 ; j < arr[i].length ; j++){
//                System.out.print(+arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
        int[][] nums = new int[3][3];
        nums = new int[][]{
                {1, 2, 3},
                {5, 6, 7},
                {8, 9, 10}
        };

//        for( int i = 0 ; i < nums.length; i++){
//            System.out.println(Arrays.toString(nums[i]));
//        }

        for(int[] a : nums){
            System.out.println(Arrays.toString(a));
        }
    }
}
