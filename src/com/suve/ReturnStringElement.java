package com.suve;

public class ReturnStringElement {
    public static void main(String[] args) {
     String str = "suvetha";
     char ch = 'j';
        System.out.println(linearSearch(str,ch));
    }

    static char linearSearch(String str , char ch){
        if(str.isEmpty()){
            return '~';
        }

        for(char c : str.toCharArray()){
            if(c==ch){
                return c ;
            }
        }
        return '~';
    }
}