public class Demo25 {
    public static void main(String[] args) throws Exception {
        String str1 = "Welcome to DEP-10";
        String str2 = "We are born to code";

        for (int k = 0; true; k++) {
        
            String str = k % 2 == 0 ? str1 : str2;
            for (int i = 0; i < str.length() + 3; i++) {
                if (i < str.length()) System.out.print(str.charAt(i));
                else System.out.print(".");
                Thread.sleep(50);
            }
            Thread.sleep(1000);
            System.out.print("\b".repeat(str.length() + 3));
            System.out.print(" ".repeat(str.length() + 3).concat("\r") );

        }
    }
}
