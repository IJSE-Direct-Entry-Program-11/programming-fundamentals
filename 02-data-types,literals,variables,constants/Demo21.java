public class Demo21 {
    public static void main(String[] args) {
        
        String something = "ABC";
        System.out.println(something);
        
        something = "\u0041\u0042\u0043";       // Hexadecimal
        System.out.println(something);

        something = "\101\102\103";             // Octal 
        System.out.println(something);
    }
}
