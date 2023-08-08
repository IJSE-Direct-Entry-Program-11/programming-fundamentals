public class Demo14 {
    public static void main(String[] args) {
        
        /* 
            + + + + +
            + + + + + 
            + + + + +
            + + + + +
            + + + + +
         */

         int y = 0;
         while (y++ < 5) {

            int x = 0;
            while (x++ < 5){
                System.out.print("+ "); //  + + + + +
            }
            System.out.println();

        }

        System.out.println();

        int k = 0;
        while (k++ < 25){
            System.out.print("+ ");
            if (k % 5 == 0) System.out.println();
        }
    }
}
