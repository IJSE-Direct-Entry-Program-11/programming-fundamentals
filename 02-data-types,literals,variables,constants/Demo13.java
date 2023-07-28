public class Demo13 {
    public static void main(String[] args) {
        byte myByte = 10;       // ❓ Value Bits (7) <= (Int) Value Bits (31)
        short myShort = myByte;
        short myShort2 = 355;   // ❓ Value Bits (15) <= (Int) Value Bits (31)

        char myChar = 'A';
        char myChar2 = 65;      // ❓ Value Bits (16) <= (Int) Value Bits (31)
        // myShort = myChar;    // ✅ Value Bits (15) <= (Char) Value Bits (16)

        // myChar = myShort;    // ❓ Value Bits (16) <= (Short) Value Bits (15)
        // myChar = myByte;     // ❓ Value Bits (16) <= (Byte) Value Bits (7)

        int myInt = myByte;
        int myInt2 = myShort;
        int myInt3 = myChar;

        int myLong = myByte;
        int myLong2 = myShort;
        int myLong3 = myChar;
        int myLong4 = myInt;

        // float myFloat = 0.2;    // ✅ Value Bits (15) <= (Double) Value Bits (16)
        float myFloat = 0.2f;
        double myDouble = myFloat;

        float myFloat2 = myInt;
        float myFloat3 = myChar;
        float myFloat4 = myShort;
        float myFloat5 = myByte;
        float myFloat6 = myLong;    // ❓ Value Bits (31) <= (Long) Value Bits (63)

        double myDouble2 = myLong;
        double myDouble3 = myInt;
        double myDouble4 = myChar;
        double myDouble5 = myShort;
        double myDouble6 = myByte;
    }
}
