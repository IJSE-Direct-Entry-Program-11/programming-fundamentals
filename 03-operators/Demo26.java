public class Demo26 {
    public static void main(String[] args) {
        // Conditional AND &&
        // Logical AND &

        // Conditional OR ||
        // Logical OR |

        int x = 10;
        int y = 5;

        /* (1) */
        boolean result1 = x == 10 & y < 10; // true & true => true
        System.out.println(result1);
        boolean result2 = x == 10 && y < 10; // true & true => true
        System.out.println(result2); 
        System.out.println();
        
        /* (2) */
        boolean result3 = x == 20 & y < 10; // false & true => false
        System.out.println(result3);
        boolean result4 = x == 20 && y < 10; // false & true => false
        System.out.println(result4);  
        
        /* (3) */
        boolean result5 = x == 10 & y > 10; // true & false => false
        System.out.println(result5);
        boolean result6 = x == 10 && y > 10; // true & false => false
        System.out.println(result6);           
    }
}
