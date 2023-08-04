public class Demo11 {
    public static void main(String[] args) {
        int x = 5, a = 5;
        int y = 2, b = 2;

        int result0 = ++x + ++y+x+++y;
        int result1 = ++a + ++b + a++ + b;
        //int result2 = ++a+ ++b + a + ++b;

        System.out.println(result0);
        System.out.println(result1);
        //System.out.println(result2);
    }
}
