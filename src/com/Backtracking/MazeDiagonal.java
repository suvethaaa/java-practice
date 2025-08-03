package com.Backtracking;

public class MazeDiagonal {
    public static void main(String[] args) {
        mazeDiagonal("",3,3);
    }

    static void mazeDiagonal(String p , int r , int c){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1 && c > 1){
            mazeDiagonal(p + 'D' , r -1 , c -1);
        }

        if(r > 1){
            mazeDiagonal(p + 'V' , r -1 , c);
        }

        if(c > 1){
            mazeDiagonal(p + 'H' , r , c -1);
        }
    }
}