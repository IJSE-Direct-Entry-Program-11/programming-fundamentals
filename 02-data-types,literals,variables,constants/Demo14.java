public class Demo14 {
    public static void main(String[] args) {
        final int MY_CONST = 10;
        final int MY_CONST2 = 10 * (int) Math.random();

        System.out.println(1250);           // ❓ By default 1250 is an int (32 bits) 
        System.out.println(100.25);         // ❓ By default 100.25 is a double (64 bits)

        byte myByte = 10;               // ✅ Value Bits (7) <= (Int) Value Bits (31)
        // byte myByte = 128;           // ✅ Out of the range
        byte myByte2 = MY_CONST;        // ✅ Compile time constant 
        // byte myByte3 = MY_CONST2;    // ✅ Run time constant 
        
        short myShort2 = 355;           // ✅ Value Bits (15) <= (Int) Value Bits (31)
        
        char myChar2 = 65;              // ✅ Value Bits (16) <= (Int) Value Bits (31)
        // char myChar3 = -65;          // ✅ Out of the range
        
        final short myShort = 65;
        final short myShort3 = -65;

        char myChar4 = myShort;         // ✅ Value Bits (16) <= (Short) Value Bits (15)
        // char myChar5 = myShort2;     // ✅ Not a compile time constant
        // char myChar6 = myShort3;     // ✅Out of the range
        // char myChar7 = myByte;       //  Not a compile time constant

        // Long, Float, Double do not involve in
        // automatic narrow primitive conversions

        // final long MY_LONG_CONST = 65;  
        // int myInt4 = MY_LONG_CONST;      
        // short myShort4 = MY_LONG_CONST;
        // byte myByte4 = MY_LONG_CONST;

        final int MY_INT_CONST = 65;
        int myInt5 = MY_INT_CONST;
        short myShort5 = MY_INT_CONST;
        byte myByte5 = MY_INT_CONST;  
        
        final short someCrazyShort = 65;
        char myChar = someCrazyShort;

        long myLong = myByte;
        float myFloat6 = myLong;        // ✅ Value Bits (31) <= (Long) Value Bits (63)

        int someInt = 555;
        long myLong7 = someInt;

        long myLong6 = 12222222555558L;  // ✅
    }
}
