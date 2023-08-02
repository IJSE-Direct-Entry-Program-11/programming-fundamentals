public class Demo15  {

    public static void main(String ...args) {
        byte myByte = 10;
        int myInt = myByte;
        int myInt2 = Integer.valueOf(Integer.toBinaryString(myInt));
        System.out.printf("%032d \n", myInt2);

        byte myByte2 = -25;
        System.out.println(Integer.toBinaryString(myByte2));

        final byte myByte3 = 10;            // COMPILE-TIME CONSTANT
        final int MY_INT3 = myByte3;        // COMPILE-TIME CONSTANT
        byte myByte4 = MY_INT3;  
        
        byte myByte5 = 10;                  // VARIABLE
        final int MY_INT4 = myByte5;        // RUN-TIME CONSTANT
        // byte myByte6 = MY_INT4;

        final byte myByte7 = (byte) Math.random();  // RUN-TIME CONSTANT
        final int MY_INT7 = myByte7;                // RUN-TIME CONSTANT
        // byte myByte8 = MY_INT7;         
        
        final int MY_INT5 = 15;             // COMPILE-TIME CONSTANT
        final int MY_INT6 = 15 * (int) Math.random();   // RUN-TIME CONSTANT

    }
}