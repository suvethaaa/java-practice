import java.util.Arrays;
public class Passing {
    public static void main(String[] args) {

//        String name = "jeni";
//        greet(name);
//        System.out.println(name);
        int[] arr = {3,4,5,7,8};
        swap(arr);
        System.out.println(Arrays.toString(arr));

    }

//    static void greet(String name1){
//        String name = "suve";
//    }
      static void swap(int[] arr1){
         arr1[0]=4;
      }

}