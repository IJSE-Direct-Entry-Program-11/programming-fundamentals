public class Demo8 {
    public static void main(String[] args) {
        int result = 5 + 2 * 3 + 10 % 3 * 2 + 1;
        System.out.println(result);

        int x = 5;
        result = (10 % x + 2 + 5 * ++x - 1)  + x++ * 2 - 4 % 2;
        System.out.printf("result=%s, x=%s \n", result, x);

        int a = 2;
        int b = 3;
        boolean result2 = !!((a++ + ++b * 2 - --a * 3 * 2 % 5 + ~0) > b-- * 2);
        System.out.printf("result=%s, a=%s, b=%s \n", result2, a, b);
    }
}
