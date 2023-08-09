public class Demo23 {
    public static void main(String[] args) {
                
        int i = 0;
        for(int k =0, j=0, n=0; i < 5; System.out.println("Update")){
            System.out.println("Hello");
            i++;
        }

        for(System.out.println("Initialization"); i < 5; System.out.println("Update")){
            System.out.println("Hello");
            i++;
        }

        /* 
            for([initialization]; boolean expression; [update/step]) statement;

            for([initialization]; boolean expression; [update/step]){
                statement...
                statement...
            }
        */

        // initialization and update can hold any valid comma seperated expression java statement(s)
        // postfix increment
        // postfix decrement
        // prefix increment
        // prefix decrement
        // assignment
        // method invocation
        // object creation
    }
}
