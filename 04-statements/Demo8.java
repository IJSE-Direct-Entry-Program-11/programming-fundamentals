import java.util.Scanner;

public class Demo8 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        /*  Syntax1: 
            if (boolean expression) statement;

            Syntax2:
            if (boolean expression) statement;

            [
            else if (boolean expression) statement;
            else if (boolean expression) statement;
            ....
            ]
            
            [else statement;]

            Syntax3:
            if (boolean expression) {
                statement(s);
                ....
            }

            Syntax4:
            if (boolean expression){
                statement(s);
                ....
            }[else if (boolean expression){
                statement(s);
            }else if(boolean expression){
                statement(s);
            }else{

            }]

         */

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        /*  Bad Practice 
            if (name.length() > 0) 
            System.out.printf("Name: %s \n", name);
        */

        if (name.length() > 0) System.out.printf("Name: %s \n", name)
        
        
        ;System.out.println("---------------");

    }
}
