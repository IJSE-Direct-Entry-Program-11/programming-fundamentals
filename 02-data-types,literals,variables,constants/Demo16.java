import java.util.Calendar;

public class Demo16 {
    public static void main(String[] args) {
        
        byte myByte = 10;           // Implicit Narrow Primitive Conversion

        final int myInt = 10;
        byte myByte2 = myInt;       // Implicit Narrow Primitive Conversion

        int myInt2 = 10;
        // byte myByte3 = myInt2;      
        byte myByte3 = (byte) myInt2;  // Explicit Narrowing Primitive Conversion   
        System.out.println(myByte3);   

        byte myByte4 = (byte) 758;     // Explicit Narrowing Primitive Conversion
        System.out.println(myByte4);  
        
        // byte myByte5 = (byte) (5 > 2);
        byte myByte6 = (byte) (10+250);
        // byte myByte7 = (byte) "abc";
        
        Object a = 10;
        int myByte8 = (int) a;
        System.out.println(myByte8);

        Object b = "abc";
        byte myByte9 = (byte) b;  
        
        int myShort = 655_811_111;

        // Calendar c = Calendar.getInstance();
        // byte myByte10 = (byte) c;        

        // Why int becomes the default data type of integer literals in programming langauges?
        // Why double becomes the default data type of floating point literals in programming langauges?

        // Narrowing Primitive Conversions
        // Implicit Narrowing Primitive Conversions (Compiler)
        // byte, short, char, int
        // 1. int -> Most integer literals are within the range of int data type
        // 2. long -> at compile time compiler has to check large value range
        //            compare to int
        long myLong = 1_022_222_222;
        int myInt3 = (int) myLong;
    }
}
