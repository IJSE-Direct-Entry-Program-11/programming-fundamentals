public class Demo27 {
    public static void main(String[] args) {
        
        for (int x = 0; x < 5; x++) {
            System.out.print("\nHello");
            if (x == 2) continue;
            System.out.print("World");
        }

        System.out.println();

        loop:
        for(int y = 0 ; y < 5; y++){
            System.out.println();
            for (int x = 0; x < 5; x++) {
                if (y == 2 && x == 2) continue loop;
                System.out.print("+ ");
            }
        }
        System.out.println();
    }
}
