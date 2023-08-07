public class Demo6 {
    public static void main(String[] args) {
        
        byte x = 1;
        x <<= 5;
        assert x == 2;

        int y = x + 5;
        System.out.println(y);

    }
}
