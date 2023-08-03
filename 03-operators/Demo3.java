public class Demo3 {
    public static void main(String[] args) {
        
        int x = 5;
        int y = x;

        y = y++ + ++x + x++ + -y + x-- + -x--;
        x = x++ + ++y + 2 + y-- + -x-- + x++;
        int result  = x++ - --y;
        System.out.printf("result=%s, x=%s, y=%s \n", result, x, y);

    }
}
