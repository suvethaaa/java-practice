package com.suve;

public class StringReturnIndex {
    public static void main(String[] args) {
        String str = "suvetha";
        char ch = 't';
        System.out.println(linearSearch(str,ch));
    }

    static int linearSearch(String str , char ch){
        if(str.isEmpty()){
            return -1 ;
        }

        for(int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1 ;
    }
}