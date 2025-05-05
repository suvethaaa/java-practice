package com.Recursion;

public class MessageProgram {
    public static void main(String[] args) {
        // writing a function to print hello world
      message();//this calls the function message

    }

    static void message(){
        System.out.println("Hello World!");
        message1();//this calls the function message1
    }
    static void message1(){
        System.out.println("Hello World!");
        message2();//this calls the function message2
    }
    static void message2(){
        System.out.println("Hello World!");
        message3();//this calls the function message3
    }
    static void message3(){
        System.out.println("Hello World!");
        message4();//this calls the function message4
    }
    static void message4(){
        System.out.println("Hello World!");//there is no more function and once it got executed the message 3
        // function will be closing same for all the above functions once no function remains to execute
        // the main method will be closing
    }



}