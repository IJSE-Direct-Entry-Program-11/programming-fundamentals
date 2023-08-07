public class Demo29 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        boolean result1 = false &  x++ > y++;
        System.out.println(result1);
        System.out.printf("x=%s, y=%s \n", x, y);
        System.out.println();

        int a = 3;
        int b = 2;

        boolean result2 = false || a++ > 2 || b++ < 2;
        System.out.println(result2);
        System.out.printf("a=%s, b=%s \n", a, b);
        System.out.println();     
        
        a = 3;
        b = 2;
        int c = 4;

        boolean result3 = (a++ != 3 && b++ < c++) | c++ == 5;
        System.out.println(result3);
        System.out.printf("a=%s, b=%s, c=%s \n", a, b, c);
        System.out.println();             
    }
}
