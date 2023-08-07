public class Demo31 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = a++ < (c - 2) && b == 3 ? (a = a++ + c) + b : 
                                          (a = ++a + b) + (b = ++a + c) - (++c -2);
                                          
        System.out.printf("a=%s, b=%s, c=%s, d=%s \n", a, b, c, d);

    }
}
