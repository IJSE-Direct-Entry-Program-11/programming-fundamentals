public class Demo1 {
    public static void main(String[] args) {
        
        int x = 1;
        x++;
        System.out.println(x);  // 2

        ++x;
        System.out.println(x);  // 3

        System.out.println("------------");

        int y = 1;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);

        // int a = 10, b = 5, c, d = 10;   // This is a very very bad practice
        int a = 10;
        int b = 5;

        int result = a++ + a++ + b + b + ++a + b++;
        System.out.printf("result=%s, a=%s, b=%s \n", result, a, b);
    }
}