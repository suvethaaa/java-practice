package com.Recursion;
import java.util.ArrayList;
public class SubsequenceAscii {
    public static void main(String[] args) {
        SubSeqAscii("","abc");
        System.out.println(SubSeqAsciiRet("","abc"));
    }

    static void SubSeqAscii(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        SubSeqAscii(p+ch,up.substring(1));
        SubSeqAscii(p,up.substring(1));
        SubSeqAscii(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> SubSeqAsciiRet(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = SubSeqAsciiRet(p+ch,up.substring(1));
        ArrayList<String> second = SubSeqAsciiRet(p,up.substring(1));
        ArrayList<String> third = SubSeqAsciiRet(p+(ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}