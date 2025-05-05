import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 1;
        int end = numbers.length;

        while(start<=end){
            int otherElement = target - numbers[start];
            int mid = start+(end-start)/2;

            if(otherElement<mid){
                end = mid-1;
            }else if(otherElement>mid){
                start = mid+1;
            }else{
                return new int[]{start,mid};
            }
        }
        return new int[]{-1,-1};
    }
}