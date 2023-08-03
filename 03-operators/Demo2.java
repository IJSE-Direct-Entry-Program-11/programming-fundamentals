public class Demo2 {
    public static void main(String[] args) {
        
        int x = 1;
        int y = 2;

        int result = ++x + ++y + x - y + x++ - --y;
        result = result + x++ + y--;
        result = x + result + y;
        System.out.printf("result=%s, x=%s, y=%s \n", result, x, y);

    }
}
