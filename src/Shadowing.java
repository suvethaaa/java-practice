
public class Shadowing {
    static int x = 40 ;//should declare the variable as static for shadowing
    public static void main(String[] args) {
        System.out.println(x);
        int x = 78;
        System.out.println(x);
        show();

    }

    static void show(){
        System.out.println(x);
    }
}