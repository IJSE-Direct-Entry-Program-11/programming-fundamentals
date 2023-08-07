public class Demo28 {
    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int z = 4;

        boolean result1 = x++ == 5 | y++ == 3 | z++ == 2;
        System.out.println(result1);
        System.out.printf("x=%s, y=%s, z=%s \n", x, y, z);
        System.out.println();

        int a = 2;
        int b = 3;
        int c = 4;

        boolean result2 = a++ == 5 || b++ == 3 || c++ == 2;
        System.out.println(result2);
        System.out.printf("a=%s, b=%s, c=%s \n", a, b, c);        

    }
}
