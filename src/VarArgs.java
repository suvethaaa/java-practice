import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
           show(8,9,"kunal","kushwaha");
          // fun(56,67,89);
    }


    static void fun(int ...m) {//when you want to pass a number of args bt not sure about the number
        System.out.println(Arrays.toString(m));
    }

    //passing multiple variable note:the varargs must be defined in last and when passing args that should follow the order
    //why should it be at last ? because the know number parameters is not know when will be coming by te program
    //ex.int a , int b , int (dont forget the space ) ...(three dots) 'n' (can be anything)


    static void  show(int a , int b , String ...s){
        System.out.println(a + "  " + b + " " + Arrays.toString(s));
    }


}