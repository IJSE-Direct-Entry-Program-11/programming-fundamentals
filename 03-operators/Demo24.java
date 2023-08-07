public class Demo24 {
    public static void main(String[] args) {
        
        /* 
         * 0000_0101
         * 0000_0010
         * ---------
         * 0000_0000    => 0
         */
        byte result1 = 5 & 2;
        System.out.println(result1);
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(result1)));

        /* 
         *  000_0010 => |-2|
         *  111_1101 => 1s Complement
         *  111_1110 => 2s Complement
         * 1111_1110 => -2
         * 1111_1111 => 255 (0xFF)
         * ---------
         * 1111_1110 => -2
         * 
         * 1111_1111_1111_1111_1111_1111_1111_1110  = -2
         * 0000_0000_0000_0000_0000_0000_1111_1111  = 255
         * ---------------------------------------
         * 0000_0000_0000_0000_0000_0000_1111_1110
         * 1111_1110 => -2
         */
        System.out.println(-2 & 0xFF);
        byte result2 = (byte) (-2 & 0xFF);
        System.out.println(result2);
        System.out.printf("%s \n", Integer.toBinaryString(result2));

        /*
         * 0000_0010 = 2  (0x2)
         * 0000_1010 = 10 (0xA)
         * ---------
         * 0000_1010 = 10
         */
        byte result3 = 0x2 | 0xA;
        System.out.println(result3);
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(result3)));

        /*
         * 0000_1001 = 9 (011)
         * 0000_0101 = 5
         * ---------
         * 0000_1100 = 12
         */
        byte result4 = 011 ^ 5;
        System.out.println(result4);
        System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(result4)));        

        byte b = 10;
        // byte y = 20;
        // byte z = b + y;

        // int abc = 10;
        long l = 15;
        // long result = abc + l;

        int x = 10;
        // float f = 10f;
        // float result = x + f;

        float f = 10f;
        double d = 25;
        //double result = f + d;

        //double result = b + x + f + l + d;
        float result = b + x + f + l;
    }
}
