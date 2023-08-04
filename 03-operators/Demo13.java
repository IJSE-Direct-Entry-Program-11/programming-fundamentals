public class Demo13 {
    public static void main(String[] args) {
        byte myByte = -127;
        int myInt = myByte << 1;
        System.out.println(myInt);
        System.out.println(Integer.toBinaryString(myInt));

        System.out.println();

        short myShort = (short) (myByte << 1);
        System.out.println(myShort);
        System.out.printf("%16s \n", Integer.toBinaryString(myShort));

        //byte myByte2 = (byte) (myByte << 1);
        //System.out.println(myByte2);

        //System.out.printf("%32s \n", Integer.toBinaryString(myByte));
        //System.out.printf("%16s \n", Integer.toBinaryString(myShort));
        //System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(myByte2)));
    }
}
