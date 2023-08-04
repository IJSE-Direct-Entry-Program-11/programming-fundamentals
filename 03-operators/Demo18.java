public class Demo18 {
    public static void main(String[] args) {
        byte a = -128;
        int b = ~a >>> 28;
        // System.out.println(b);
        int c = b * 2 + ++a;
        System.out.println(c); 

        System.out.println();

        byte myByte = ~0;
        int myInt = myByte >> (31 - myByte);
        System.out.println(Integer.toBinaryString(myInt));
        myInt = myInt << 1;
        System.out.println(myInt);
    }
}
