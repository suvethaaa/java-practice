package com.suve;

public class LsString {
    public static void main(String[] args) {
        String name = "suvetha";
        char ch ='t';
        System.out.println(linearSearch(name,ch));
    }

    static boolean linearSearch(String str , char ch){
        if(str.isEmpty()){
            return false;
        }

        for(char c : str.toCharArray()){
            if(c == ch){
               return true ;
            }
        }
        return false;
    }
}