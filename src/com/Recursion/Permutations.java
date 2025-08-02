package com.Recursion;

public class Permutations {
    public static void main(String[] args) {
       permutations("","abc");

//        String str = "suvetha";
//        System.out.println(str.substring(0,5)); prints frm 0 index of 5 characters
    }
// Recursion is breaking down problems into sub problems
//taking a character in the unprocessed string and looking where we should place the character in processed
//at every recursive call there is a variable number of recursive calls
//but actually the number of recursive calls is dependent on the processed character +  1
    static void permutations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }
}