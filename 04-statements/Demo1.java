public class Demo1 {

    public static void main(String[] args) {

        ;
        ;
        ;
        ;   // This is an empty statement

        {
            // This is a block
            {
                // This is also a block
            }
        }

        final String HELLO = "Hello ";
        String greeting = HELLO.length() > 5 ? "Statements": "Expressions";
        System.out.println(HELLO + greeting);

    }
}