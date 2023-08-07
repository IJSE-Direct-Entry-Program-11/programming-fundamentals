public class Demo4 {
    public static void main(String[] args) {
        
        abc:
        System.out.println("Hello");
    
        myBlock:
        {
            System.out.println("Welcome");
            System.out.println("to");
            
            if (true) break myBlock;

            // Unreachable statments 
            System.out.println("DEP-10");
        }

        System.out.println("DEP-11");

        // Local variable declaration statemnt
        int x;
        // Local constant declaration statement
        final int y;
    }
}
