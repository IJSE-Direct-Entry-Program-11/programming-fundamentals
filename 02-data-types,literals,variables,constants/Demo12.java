public class Demo12 {
    public static void main(String[] args) {
        
        int id1 = 1;
        String name1 = "Kasun";
        String address1 = "Galle";

        int id2 = 2;
        String name2 = "Nuwan";
        String address2 = "Matara";

        System.out.printf("id=%s, name=%s, address=%s \n", id1, name1, address1);
        System.out.printf("id=%s, name=%s, address=%s \n", id2, name2, address2);

        final String COLOR = "\033[32;1m";
        final String RESET = "\033[30;0m";

        System.out.println("+----+------+---------+");
        System.out.printf("| %sID%s | %sNAME%s | %sADDRESS%s |\n", COLOR,RESET, COLOR, RESET, COLOR, RESET);
        System.out.println("+----+------+---------+");

        System.out.println("+----+------+---------+");
        System.out.printf("| %1$sID%2$s | %1$sNAME%2$s | %1$sADDRESS%2$s |\n", COLOR, RESET);
        System.out.println("+----+------+---------+");
        System.out.println();

        System.out.printf("ID=%1$s, NAME=%2$s, ID=%1$s, NAME=%2$s \n", 1, "Kasun");
        
    }
}
