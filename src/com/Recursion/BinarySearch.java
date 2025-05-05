package com.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,66,77};
        int target = 77;
        System.out.println(search(arr,target,0, arr.length-1));
    }

    //########## three thing have to keep in mind
    // Arguments , return type , body of the function
    //whatever you put in the arguments it is going to go in the next function call
    //and here we can not simply pass only the array and the target because we have
    // to reduce the size of the search space
    //and return type is that function returns like output ex: an index
    //as for the body it is the thing that specific to only that function call ex :like mid

    static int search(int[] arr , int target , int start , int end){
        //make sure the return value are same for the sub recursions
        if(start> end){
            return -1;
        }
        int mid = start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(target < arr[mid]){
           return  search(arr,target,start, mid-1);
        }
            //make sure to return the result of a function call of the return type
            return search(arr,target,mid+1, end);
            //the value will be only returned where it was called

    }
}