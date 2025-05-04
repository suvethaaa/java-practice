package com.Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float y = 33.455555555f;
        //%-it is the placeholder that we are likely telling the method keep this in consideration and the
        //value will be given later
        //note the printf
        System.out.printf("The formatted value of %.2f",y);
    }
}