package com.ObjectOrientedProgramming;

public class Constructors {
    public static void main(String[] args) {

//        Details yes = new Details(89,22,"kunal");
//        System.out.println(yes.name);
//        System.out.println(yes.roll_no);
//        System.out.println(yes.marks);

        Details dem = new Details();
        System.out.println(dem.name);

        Details random = new Details(dem);
        //this will be replaced by random and other is replaced by dem
        System.out.println(random.name);


    }

    static class Details{
        int marks;
        int roll_no;
        String name;

        Details(int marks,int roll_no,String name){
            this.marks = marks;
            this.roll_no = roll_no;
            this.name = name;// without this keyword there will be only printing the null values
            //you cant directly manipulate the class variables, but you can use  this keyword to manipulate
            //because that only affects the particular objects

            //why to use this keyword? because the code cannot identify which variable you are referring to
        }

//        Details(){ //constructor overloading
//            this.marks = 99;
//            this.roll_no = 47;
//            this.name = "jeni";
//
//            //at default these values are assigned to the template and without this keyword the cannot
//            // identify which instance to alter
//        }

        Details( Details other){
            this.name = other.name;
            this.roll_no = other.roll_no;
            this.marks = other.marks;
        }

        Details(){
            //how to call a constructor from other constructor
            //internally : student(100,21,"gloria");
            this(100,21,"gloria");

        }
    }
}