public class Demo20 {
    public static void main(String[] args) {
        
        // (Primitive | Reference) Data Type -> String 

        int x = 10;
        String myStr = x + "";

        boolean myBool = false;
        String myStr2 = myBool + "";

        // String -> Primitve Data Type
        /* Wrappers
        -------------
         * Byte.valueOf(String) -> byte
         * Short.valueOf(String) -> short
         * "string".charAt(index) -> char
         * Integer.valueOf(String) -> int
         * Long.valueOf(String) -> long
         * Float.valueOf(String) -> float
         * Double.valueOf(String) -> double
         */

        String myStr3 = "10";
        byte myByte = Byte.valueOf(myStr3);

        String myStr4 = "10.25";
        double myDouble = Double.valueOf(myStr4);

        char myChar = "ABC".charAt(1);
        System.out.println(myChar);

        String myStr5 = "abc";
        long myLong = Long.valueOf(myStr5);

    }
}
