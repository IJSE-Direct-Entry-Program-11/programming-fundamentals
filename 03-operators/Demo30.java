public class Demo30 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        String result = (++a == b) ? "DEP-" + (10 + 1) : "IJSE";
        System.out.println(result);

        int c = ++b > a ? (b = ++a + b) + 5 : (a = a++ + b) - 2;
        System.out.println("b=" + b);
        System.out.println("a=" + a);
        System.out.println("c=" + c);
        System.out.println();

        int x = 0;
        int y = 0;
        x = y = 5;      // Bad Practice
        System.out.println(x);
        System.out.println(y);

        int x1;
        int y1;

        x1 = (y1 = 5);
        System.out.println(x1);
        System.out.println(y1);
    }
}
