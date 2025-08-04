package com.Backtracking;

import java.util.ArrayList;
public class MazeDiagonalList {
    public static void main(String[] args) {
        ArrayList<String> ans = mazeDiagonalList("",3,3);
        System.out.println(ans);
    }

    static ArrayList<String> mazeDiagonalList(String p , int r , int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(mazeDiagonalList(p + 'D' , r -1 , c -1));
        }

        if(r > 1){
            ans.addAll(mazeDiagonalList(p + 'V' , r -1 , c));
        }

        if(c > 1){
            ans.addAll(mazeDiagonalList(p + 'H' , r , c -1));
        }
        return ans;
    }
}