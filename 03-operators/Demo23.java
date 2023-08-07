public class Demo23 {
    public static void main(String[] args) {

        // AND &
        // OR  |
        // XOR ^
        
        byte myByte1 = 0B0000_0101;
        byte myByte2 = 0B0000_0011;

        byte myResult1 = (byte) (myByte1 & myByte2);    // 0000_0001 => 1
        System.out.println(myResult1);
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(myResult1)));

        byte myResult2 = (byte) (myByte1 | myByte2);    // 0000_0111 => 7
        System.out.println(myResult2);
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(myResult2)));        

        byte myResult3 = (byte) (myByte1 ^ myByte2);    // 0000_0110 => 6
        System.out.println(myResult3);
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(myResult3)));                

    }
}
