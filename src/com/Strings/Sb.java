package com.Strings;

// remember ? freaking around with the memory so there comes a class called String Builder that
//enables us to modify Strings

public class Sb {
    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for(int i = 0 ; i<26;i++){
            build.append((char)('a'+i));
        }
        //methods
        //if you give the character it only cnsiders the character value

        build.delete(3,5);
        System.out.println(build);
    }
}
