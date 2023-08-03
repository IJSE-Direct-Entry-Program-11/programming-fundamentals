public class Demo9 {
    public static void main(String[] args) {
        
        String myStr1 = "Hello";
        String myStr2 = "Java";
        int myInt1 = 10;
        int myInt2 = 1;
        char myChar = '!';

        System.out.println("" + myInt1 + myInt2 + myChar);
        System.out.println(myInt1 + myInt2 + myChar + "" + 10 + 12);

        System.out.println("------------");

        System.out.println("" + (myInt1 + myInt2 + myChar));
        System.out.println(myInt1 + myInt2 + myChar + "" + (10 + 12));

        System.out.println(myStr1
                            .concat(" ")
                            .concat(myStr2)
                            .concat(" ")
                            .concat((myInt1 + myInt2) + "")
                            .concat(myChar + ""));

        String myStr = myStr1 + " " +  myStr2 + " " +  (myInt1 + myInt2) + myChar ;
        System.out.println(myStr);
        
        // String result = myInt1 + myInt2 + " " + myStr1;
        // System.out.println(result);
    }
}
