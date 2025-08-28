package com.ObjectOrientedProgramming;

import java.util.Arrays;

public class Teacher {
    public static void main(String[] args) {

        Students[] list = new Students[5];

        //Students suve;//declaring the reference to the object

        //System.out.println(suve.roll_no); // if you try to run this without initialisation it will give an error
        //and there is where the concept of new keyword comes in

        System.out.println(Arrays.toString(list));// this list prints the null values before storing any values in the list

        //creating an object that is just initialised

        Students sti = new Students();

        System.out.println(sti);
        System.out.println(sti.roll_no);
        System.out.println(sti.marks);
        System.out.println(sti.name);

        Students suve = new Students();

        suve.roll_no = 47;
        suve.marks = 99.9f;
        suve.name = "suvetha";
        System.out.println(suve.roll_no);
        System.out.println(suve.marks);
        System.out.println(suve.name);


    }

    static class Students{

        int roll_no ;
        float marks ;
        String name ;
    }
}