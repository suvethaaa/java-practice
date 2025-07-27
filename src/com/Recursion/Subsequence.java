package com.Recursion;
import java.util.ArrayList;
public class Subsequence {
    public static void main(String[] args) {
//        SubSeq("","abc");
        System.out.println(SubSeq1("","abc"));
    }

    static void SubSeq(String p , String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        SubSeq(p+ch , up.substring(1));
        SubSeq(p , up.substring(1));
    }

    static ArrayList<String> SubSeq1(String p , String up){

        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = SubSeq1(p+ch , up.substring(1));
        ArrayList<String> right = SubSeq1(p , up.substring(1));

        left.addAll(right);
        return left;
    }
}