import java.util.Scanner;

public class Demo9 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // byte, short, char, int 
        // Byte, Short, Character, Integer
        // String, Enum

        // switch -> if ✅
        // if -> switch ❌

        /* 
            switch labels should be constant expressions or enum member

            switch (expression){
                case switchLabel1:
                case switchLabel2:
                case switchLabel3:
                default:
            }
         */

         System.out.print("Enter your grade: ");
         char grade = scanner.nextLine().strip().charAt(0);

        //  if (grade == 'A') System.out.println("Distinguished Pass");
        //  else if (grade == 'B') System.out.println("Credit Pass");
        //  else if (grade == 'C') System.out.println("Pass");
        //  else if (grade == 'W') System.out.println("Fail");
        //  else System.out.println("Invalid Grade");

        final int myAGrade = 60;

         switch(grade + 1) {
            case myAGrade + 5: 
                System.out.println("Distinguished Pass"); 
                break;
            case 'B': 
                System.out.println("Credit Pass"); 
                System.out.println("Credit Pass"); 
                System.out.println("Credit Pass"); 
                break;
            case 'C': 
                System.out.println("Pass"); 
                break;
            case 'W': 
                System.out.println("Fail");
                break;
            default: 
                System.out.println("Invalid Grade");                 
         }

         System.out.println("Just after switch statement");
    }
}
