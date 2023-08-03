public class Demo4 {
    public static void main(String[] args) {
        
        byte myByte = 10;       // 0000 1010
        int myInt = ~myByte;    // 1111 0101
        System.out.println(Integer.toBinaryString(myInt));

        byte myByte2 = -5;
        myByte2 = (byte)~myByte2;
        System.out.println(myByte2);
        System.out.println(~6);
        int result = myByte2++ + ~++myByte2;
        System.out.printf("result=%s, myByte2=%s \n", result, myByte2);
    }
}
