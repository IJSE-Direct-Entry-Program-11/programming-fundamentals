public class Demo22 {
    public static void main(String[] args) {
        // primitive (int) = primitive (int)
        int myInt = 10;                 

        // reference (Integer) = primitive (int)
        //Integer myInt2 = new Integer(10);         // This is boxing (wrap)
        // Integer myInt2 = Integer.valueOf(10);    // This is boxing
        Integer myInt2 = 10;                        // This is auto-boxing

        // int myInt3 = myInt2.intValue();          // This is unboxing (unwrap)
        int myInt3 = myInt2;                        // This is auto-unboxing

        // This is auto-unboxing as well (numeric context)
        System.out.println(myInt + myInt2 + myInt3);
        
        // primitive (byte) = primitive (int)
        byte myByte = 10;

        // reference (Byte) = primitive (int)

        // byte myByteVar = 10 (Narrowing Primitive Conversion)
        // Byte myByte2 = new Byte(myByteVar); Boxing
        // Byte myByte2 = new Byte((byte) 10);
        Byte myByte2 = 10;

        // myByte2.byteValue() <- unwrap (Auto unboxing)
        // (int) myByte2.byteValue() <- Widening Primitive Conversion
        System.out.println(myInt + myByte2);
    }
}