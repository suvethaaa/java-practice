package com.ObjectOrientedProgramming;

public class Classes {
    public static void main(String[] args) {

//        Students[] list = new Students[5];
//
//        //Students suve;//declaring the reference to the object
//
//        //System.out.println(suve.roll_no); // if you try to run this without initialisation it will give an error
//        //and there is where the concept of new keyword comes in
//
//        System.out.println(Arrays.toString(list));// this list prints the null values before storing any values in the list
//
//        //creating an object that is just initialised
//
//        Students sti = new Students();
//
//        System.out.println(sti);
//        System.out.println(sti.roll_no);
//        System.out.println(sti.marks);
//        System.out.println(sti.name);
//
//        Students suve = new Students();
//
//        suve.roll_no = 47;
//        suve.marks = 99.9f;
//        suve.name = "suvetha";
//        System.out.println(suve.roll_no);
//        System.out.println(suve.marks);
//        System.out.println(suve.name);

        Students suve = new Students();
//        System.out.println(suve.name);
        suve.changeName("shoe lover");
        suve.greeting();


    }

    static class Students{

        int roll_no ;
        float marks ;
        String name ;

        void greeting() {
            System.out.println("Hello ! My name is " + this.name);
        }

        void changeName(String newName){
            name = newName;
        }

        //when accessing the class through an object , this keyword becomes the object name
        Students () {
            this.roll_no = 13;
            this.marks = 87 ;
            this.name = "suvetha";
        }

        //created an object for the student class named as suve hence when the constructor is created the name
        //will be suvetha then when the function change name is called the name variable is changed to
        // shoe lover and the greetings prints the show  lover


    }
}