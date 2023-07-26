public class Demo10 {
    public static void main(String[] args) {
        String someString1 = "This\t\tis a string";
        System.out.println(someString1);
        String someString2 = "This is an\b string";
        System.out.println(someString2);
        String someString3 = "This is awesome\r What the heck?";
        System.out.println(someString3);
        String someString4 = "This is a Multiline\n\r line String in windows";
        System.out.println(someString4);
        String someString5 = "This is a Multiline\n line String in other operating systems";
        System.out.println(someString5);
        String someString6 = "What if I want to print just \\ <- this";
        System.out.println(someString6);
        String someString7 = "What if I want to print just \" <- this";
        System.out.println(someString7); 
    }
}
