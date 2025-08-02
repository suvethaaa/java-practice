package com.Recursion;

public class Dice {
    public static void main(String[] args) {
           dice("",4);

    }

    static void dice(String p , int target){
        if(target== 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p+i , target -i);
        }

        //keep an eye on the current target and check whether the i is less than our current target
    }
}