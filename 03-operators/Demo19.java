public class Demo19 {
    public static void main(String[] args) {
        int x = 2;
        int y = ~x++;

        char myChar = '1';
        
        int a = ~~--y + Integer.valueOf(x + myChar + "" + ~y);

        int b = a * x + y + --x << 2 + (myChar + "").length();
        System.out.println(b);

        b = b+++y*3<<1;
        
        System.out.printf("b=%s, a=%s, x=%s, y=%s \n", b, a, x, y);
    }
}
