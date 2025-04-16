
public class Overloading {
    public static void main(String[] args) {
        //to run which function is decided at the runtime based on the arguments
        //can be applied in varArgs and remember sum example
        //Ambiguity: the null varArg method cannot be used if there is a method overloading with varArg and the error of passing no parameter is known as Ambiguity.
        fun(10);
        fun("suve");
        fun(9,8);
        fun("suve","jeni");
    }

    // method overloading is basically when two or more methods have th same name
    //if we write the method simply it will show error but we can differentiate it through the varied parameters or arguments
    //the program runs the actual method by the type of args we pass

    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
    static void fun(int  b , int c ){//when it was just b it does not work
        System.out.println(b);
        System.out.println(c);
    }
    static void fun(String gender , String surname){//when it was just gender it also does not work
        System.out.println(gender);
        System.out.println(surname);
    }
}