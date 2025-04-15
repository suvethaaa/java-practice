
public class Scoping{
    public static void main(String[] args) {
      /*two things need to remember the variables created outside the block can be used inside the block
         the variable created outside the block cannot be used outside the block.
         the variables initialised outside the block cannot be initialised again inside the block
         Anything that initialised inside the block can definitely initialise outside the block
         */
        int a = 10 ;
        int b = 90;
        String name = "sun";
        {
            a = 45 ;
            int c = 67;
            System.out.println(a);
            System.out.println(name);
            name = "moon";
            System.out.println("moon");
        }

        System.out.println(a);
        System.out.println(name);
//        System.out.println(c);cannot be printed because it is initialisied  inside the block

    }
}