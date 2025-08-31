package com.ObjectOrientedProgramming;

public class UnderstandingThis {
    public static void main(String[] args) {

        Details yes = new Details(89,22,"kunal");
        System.out.println(yes.name);
        System.out.println(yes.roll_no);
        System.out.println(yes.marks);



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
        }
    }
}