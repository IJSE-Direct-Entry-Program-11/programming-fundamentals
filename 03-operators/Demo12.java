public class Demo12 {
    public static void main(String[] args) {
        
        byte myByte = 10;
        byte myByte2 = (byte) (myByte << 2);
        System.out.println(myByte2);

        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(myByte)));
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(myByte2)));

    }
}
