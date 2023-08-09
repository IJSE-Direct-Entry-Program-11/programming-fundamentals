import java.util.Scanner;

public class Demo21 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        final String COLOR_GREEN = "\033[42m";
        final String RESET = "\033[0m";
        int num = 0;
        int speed = 0;

        do{
        System.out.print("Enter a number between (0 to 100):");
        num = scanner.nextInt();
        scanner.nextLine();

            if (num < 0 || num > 100){
                System.out.println("Invalid number, try again!");
            }
        }while(num < 0 || num > 100);

        do{
        System.out.println("Select speed");
        System.out.println("(1) Fast");
        System.out.println("(2) Medium");
        System.out.println("(3) Slow");
        System.out.print("Enter your option: ");
        speed = scanner.nextInt();
        scanner.nextLine();

            if (!(speed == 1 || speed == 2 || speed == 3)){
                System.out.println("Invalid speed, try again");
                speed = 0;
            }
        }while(speed == 0);

        speed *= 200;

        int x = 0;
        String precentage = "10.00%";
        do {
            System.out.print("\b".repeat(23 + precentage.length()));
            System.out.print("[");
            System.out.printf("%s%s%s%s",
                COLOR_GREEN," ".repeat(x), RESET,
              " ".repeat(20-x));
            System.out.print("] ");
            precentage = String.format("%.2f%%", x / 20.0 * 100);
            
            if (x / 20.0 * 100 >= num){
                precentage = String.format("%.2f%%", num * 1.0);
                System.out.println(precentage);
                break;
            }
            
            System.out.print(precentage);
            Thread.sleep(speed);
        } while (x++ < 20);
        System.out.println();
    }
}
