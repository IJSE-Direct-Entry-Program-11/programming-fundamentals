public class Demo24 {
    public static void main(String[] args) throws Exception {
        
        String chars = "|/-\\|/-\\";

        System.out.print("Loading ");
        for(int i = 0; i < chars.length(); i++){
            System.out.print("(");
            System.out.printf("%s", chars.charAt(i));
            System.out.print(")");
            Thread.sleep(50);
            System.out.print("\b".repeat(3));
            if ((i+1) == chars.length()) i = -1;
        }
        System.out.println();

        
    }
}
