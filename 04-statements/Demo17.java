public class Demo17 {
    public static void main(String[] args) {
        /*
            Single Loop, Nested Loops
            Via + (Space)

            + + + + + + +
            + + +   + + +
            + +       + +
            +           +

        */

        int k = 0;
        int y = 0;
        int x = 0;
        int m = 0;
        while (k++ < 28) {
            x = k - (y * 7);
            if (x > (4 - m) && x < (4 + m)){
                System.out.print("  ");
            }else{
                System.out.print("+ ");
            }

            if (k % 7 == 0){
                System.out.println();
                y++;
                m++;
            }
        }

        // int y = 0;
        // int k = 0;
        // while (y++ < 4){

        //     int x = 0;
        //     while (x++ < 7){
        //         if (x > (4 - k) && x < (4 + k)){
        //             System.out.print("  ");
        //         }else{
        //             System.out.print("+ ");
        //         }
        //     }

        //     k++;
        //     System.out.println();
        // }

    }
}
