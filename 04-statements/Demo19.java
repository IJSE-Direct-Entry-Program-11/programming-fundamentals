public class Demo19 {
    public static void main(String[] args) {
        
        /* 
            do statement while(boolean expression);

            do{
                statement
                statement
                statement
            } while(boolean expression);
         */

         int k = 0;
         do System.out.println("Hello"); while(k++ < 5);

         /* 
            + + + + +
            + + + +
            + + +
            + +
            +
          */
        
        int y = 0;

        do{

            k = 0;
            do System.out.print("+ "); while (k++ < (4-y));

            System.out.println();

        }while(y++ < 4);

        System.out.println("\n\n");

        k = 0;
        int x = 0;
        y = 0;
        do {

            x = k - y * 5; 
            if (x < 5-y) System.out.print("+ ");

            if ((k+1) % 5 == 0) {
                System.out.println();
                y++;
            }
        }while (k++ < 24);

        /*
            + + + + +
            + + + +
            + + +
            + +
            +
            + +
            + + +
            + + + +
            + + + + +

         */

         System.out.println();
         k = 0;
         x = 0;
         y = 0;
         int j = -1;
         int m = 5;

         do {
            x = k - y * 5;
            if (x < m){
                System.out.print("+ ");
            }

            if ((k+1) % 5 == 0){
                System.out.println();
                y++;
                m += j;
                if (m == 1) j = 1;
            } 
         } while (k++ < 44);
    }
}
