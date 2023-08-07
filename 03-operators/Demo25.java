public class Demo25 {
    public static void main(String[] args) {
        
        boolean flag1 = 5 > 2;                  // true
        boolean flag2 = 10 < 5;                 // false
        boolean flag3 = "ijse".length() == 4;   // true

        /* true     & true => true */
        System.out.println(flag1 & flag2);      // false
        System.out.println(flag1 & flag3);      // true
        System.out.println();

        /* true     & false => true */
        /* false    & true  => true */
        /* true     & true  => true */
        System.out.println(flag1 | flag2);      // true
        System.out.println(flag2 | flag1);      // true
        System.out.println(flag2 | false);      // false
        System.out.println(flag2 | flag3);      // true
        System.out.println();

        /*  true    & false => true */
        /*  false   & true  => true */
        System.out.println(flag1 ^ true);       // false
        System.out.println(flag1 ^ flag2);      // true
        System.out.println(flag2 ^ false);      // false
        System.out.println(flag3 ^ false);      // true

    }
}
