public class Demo13 {
    public static void main(String[] args) {
        /* Loops */

        // System.out.println("Hello World!");
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");
        // System.out.println("Hello World!");

        /* 
            while (boolean expression) statement;

            while (boolean expression) {
                statement(s)...
            }
         */

         int x = 0;
         boolean flag = true;
         while (flag) {
            System.out.println("Hello World");
            x++;
            if (x == 5) flag = false;
         }
         System.out.println();

         int y = 0;
         while (y++ < 5){
            System.out.println("Hello World");
         }
         System.out.println();

         int z = 0;
         while (z < 5) {
            System.out.println("Hello World!");
            z++;
         }
         System.out.println();

         int r = 0;
         while (true){
            System.out.println("Hello World");
            if (++r == 5)  break;
         }

        // System.out.println("Loops-1");
        // System.out.println("Loops-2");
        // System.out.println("Loops-3");
        // System.out.println("Loops-4");
        // System.out.println("Loops-5");

        int a = 1;
        while (a <= 5){
            System.out.println("Loops-" + a++);
        }
    }
}
