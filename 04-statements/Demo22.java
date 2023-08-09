public class Demo22 {
    public static void main(String[] args) {
        
        int x = 0;                  // initialization
        while (x < 5){              // boolean expression
            System.out.println("Hello");
            x++;                    // update
        }

        // for([initialization]; boolean expression; [update/step]) statement;
        /* 
            for([initialization]; boolean expression; [update/step]){
                statement...
                statement...
            }
        */

        System.out.println();

        int i = 0;
        for( ; i < 5 ;  ){
            System.out.println("Hello");
            i++;
        }        

        // for(int i = 0; i < 5; i++){
        //     System.out.println("Hello");
        // } 
            

    }
}
