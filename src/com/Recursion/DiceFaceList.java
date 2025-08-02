package com.Recursion;

import java.util.ArrayList;

public class DiceFaceList {

    public static void main(String[] args) {
        ArrayList<String> ans = diceFaceList("",4,7);
        System.out.println(ans);
    }
    //dice recursion code for dice with custom face
    static ArrayList<String> diceFaceList(String p , int target,int face){

        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll( diceFaceList(p+i , target -i , face));
        }
        return ans;
    }
}