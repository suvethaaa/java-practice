import java.util.HashSet;
import java.util.Set;

public class HashSetDuplicates {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] arr = {1 , 3 , 4 , 4 , 5};
        for(int num : arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}