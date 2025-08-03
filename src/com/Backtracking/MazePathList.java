package com.Backtracking;

import java.util.ArrayList;

public class MazePathList {
    public static void main(String[] args) {
        ArrayList<String>  ans = mazeList("",3,3);
        System.out.println(ans);

    }

    static ArrayList<String> mazeList (String p , int r , int c){

        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();// local variable exist for that particular call

        if(r > 1){
            ans.addAll(mazeList(p+'D' , r-1,c));
        }

        if(c > 1){
            ans.addAll(mazeList(p+'R' , r , c -1));
        }

        return ans;

    }
}