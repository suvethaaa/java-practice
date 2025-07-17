package com.Recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class ReturningArrLst {
    public static void main(String[] args) {
       //ArrayList<Integer> lst = new ArrayList<Integer>();
        int[] arr = {1,2,3,4,4,5};
//        System.out.println(search(arr,4,0,new ArrayList<Integer>()));
        System.out.println(search(arr,4,0));
    }

//    static ArrayList<Integer> search(int[] arr , int target , int index , ArrayList<Integer> lst){
//
//        if(index == arr.length){
//            return lst;
//        }
//        if(arr[index] == target){
//            lst.add(index);
//        }
//
//        return search(arr,target,index +1,lst);
//    }

    static ArrayList<Integer> search(int[] arr , int target , int index){
        ArrayList<Integer> lst = new ArrayList<>();
        if(index == arr.length){
            return lst;
        }
        if(arr[index] == target){
            lst.add(index);
        }
        ArrayList<Integer>  ansFromBelowCalls = search(arr,target,index+1);

        lst.addAll(ansFromBelowCalls);
        return lst;
    }
}