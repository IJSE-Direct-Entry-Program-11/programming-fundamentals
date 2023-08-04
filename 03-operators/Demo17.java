public class Demo17 {
    public static void main(String[] args) {
        
        byte x = -2;
        int y = x >>> 30;
        int result = x + y;
        System.out.println(result);

        byte a = (byte) ~x;
        
        int b = a << 2;

        b = b++ + a;
        System.out.println(b);

    }
}
