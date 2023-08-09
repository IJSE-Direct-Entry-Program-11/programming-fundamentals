public class Demo16 {
    public static void main(String[] args) {
        
        /* 
            Single Loop, Nested Loops
            Via +

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

         int k = 0;
         int y = 0;
         int x = 0;
         int m = 5;
         int j = -1;
         while (k++ < 45){

            x = k - 5 * y;
            if (x <= m){
              System.out.print("+ ");
            }

            if (k % 5 == 0) {
              m += j;
              if (m == 1) j = 1;
              y++;
              System.out.println();
            }
         }

        // int y = 0;
        // int k = 5;
        // boolean reverse = false;
        // while (y++ < 9){

        //   int x = 0;
        //   while (x++ < k){
        //     System.out.print("+ ");
        //   }

        //   if (!reverse){
        //     k--;
        //     if (k == 1) reverse = true;
        //   }else{
        //     k++;
        //   }
        //   System.out.println();
        // }

        // int y = 0;
        // int k = 5;
        // int i = -1;
        // while (y++ < 9){

        //   int x = 0;
        //   while (x++ < k){
        //     System.out.print("+ ");
        //   }

        //   k += i;
        //   if (k == 1) i = 1;
        //   System.out.println();
        // }

        // int y = 0;
        // int k = 5;
        // while (y++ < 5){
        //   int x = 0;
        //   while (x++ < k){
        //     System.out.print("+ ");
        //   }
        //   k--;
        //   System.out.println();
        // }

        // y = 0;
        // k = 2;
        // while (y++ < 4){

        //   int x = 0;
        //   while (x++ < k){
        //     System.out.print("+ ");
        //   }

        //   k++;
        //   System.out.println();
        // }   




         /*
            Single Loop, Nested Loops
            Via + (Space)

            + + + + + + +
            + + +   + + +
            + +       + +
            +           +

          */

         /*
            Nested Loops
            Via + (Space)


            + + + + + + +
            + + +   + + +
            + +       + +
            +           +
            + +       + +
            + + +   + + +
            + + + + + + +
          */  
          


         /* 
            Nested Loops
            Via + / \


            + + + + + +
            + + / \ + +
            + / / \ \ +
            + \ \ / / +
            + + \ / + +
            + + + + + +
          */

          /*
            Nested Loops
            Via + / \

            + + + + + 
            + / + \ +
            + + + + +
            + \ + / +
            + + + + +

           */

           /*
            Nested Loops
            Via + Space

                + 
              + + +
            + + + + + 
              + + + 
                + 
            */
    }
}
