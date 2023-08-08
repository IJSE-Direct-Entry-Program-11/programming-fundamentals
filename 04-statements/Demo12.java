import java.util.Scanner;

public class Demo12 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Select an option");
        System.out.println("1. Proceed");
        System.out.println("2. Exit");
        System.out.print("Enter the option: ");
        int option = scanner.nextInt();
        scanner.nextLine();

        outerSwitch:
        switch (option){
            case 1:
                System.out.println("Select an option");
                System.out.println("1. Enter name");
                System.out.println("2. Exit");
                System.out.print("Enter the option: ");  
                option = scanner.nextInt();
                scanner.nextLine();
                
                switch(option) {
                    case 1:
                        System.out.print("Enter your name here: ");
                        String name = scanner.nextLine();
                        if (name.isBlank()){
                            System.out.println("Name can't be empty");
                            break outerSwitch;
                        }else System.out.println("Welcome " + name);
                        break;
                    case 2:
                        System.out.println("You are about to exit");
                        break;
                }
                System.out.println("You are about to exit from outer switch");
                break;
            case 2:
                System.out.println("About to exit");
                System.exit(0);
        }
    }
}
