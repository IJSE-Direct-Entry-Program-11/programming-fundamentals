public class Demo15 {
    public static void main(String[] args) {
        
        /*
            + + + + +
            + + + +
            + + +
            + +
            +
         */

        //  int k = 0;
        //  int m = 5;
        //  while (k++ < m){
        //     System.out.print("+ ");
        //     if (k == m) {
        //         m--;
        //         k = 0;
        //         System.out.println();
        //     }
        //  }

         int k = 0;
         int m = 5;
         int a = m;
         while (k++ < 15){
            System.out.print("+ ");
             if (k == m){
                m = k + --a;
                System.out.println();
             }
         }

        // int y = 0;
        // int z = 5;

        // while (y++ < 5){

        //     int x = 0;
        //     while (x++ < z){
        //         System.out.print("+ ");
        //     }
        //     System.out.println();
        //     z--;

        // }

    }
}
