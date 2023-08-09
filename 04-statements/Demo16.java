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

        int y = 0;
        int k = 5;
        boolean reverse = false;
        while (y++ < 9){

          int x = 0;
          while (x++ < k){
            System.out.print("+ ");
          }

          if (!reverse){
            k--;
            if (k == 1) reverse = true;
          }else{
            k++;
          }
          System.out.println();
        }

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
