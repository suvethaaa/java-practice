package com.Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 0,1,2,8,9,7,6};
        //checking whether the element is in the array
        System.out.println(search1(arr,0,8));
        //retrieving the index
        System.out.println(search2(arr,0,8));
        //searching in reverse
        System.out.println(search3(arr,6,8));

}

    static boolean search1(int[] arr , int index , int target){

  if(index == arr.length){
            return false;
        }
        return arr[index] == target || search1(arr,index+1,target);
    }

    static int search2(int[] arr , int index , int target){

        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return search2(arr,index+1,target);
        }
    }

    static boolean search3(int[] arr , int index , int target){

        if(index == -1){
            return false;
        }

        return arr[index] == target || search3(arr,index-1,target);
    }
}
