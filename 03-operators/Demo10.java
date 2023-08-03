public class Demo10 {
    public static void main(String[] args) {
        int x = 2;
        int y = 1;
        String myStr = "Welcome to DEP!";
        int result = ~~(myStr.charAt(11) - 60) + x++ + ++y * 2 + 3 * 5 % 10 * 2;
        String finalResult = result + 5 + "" + x + y;
        System.out.println(finalResult);
        System.out.println(!!(finalResult.length() > 7));
        System.out.printf("result=%s, x=%s, y=%s \n", result, x, y);
    }
}
