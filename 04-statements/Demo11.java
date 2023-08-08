import java.util.Scanner;

public class Demo11 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter a number between 0 to 5: ");
        int num = scanner.nextInt();
        scanner.nextLine();
mySwitch:
        switch(num * num){
            case 2 * 2:
                System.out.println("2 ^ 2");
                abc:
                {
                    System.out.println("I am inside the abc");
                    edf:
                        System.out.println("I am assosiated with edf");
                        inside:{
                            System.out.println("Inside Inside");
                            if (true) break abc;
                            System.out.println("Inside the inside");
                        }
                        System.out.println("Am I inside the edf?");
                }
                System.out.println("Will this be executed?");
                break;
            case 10 - 1:
            lbl1:{
                System.out.println("3 ^ 3");
                break lbl1;
            }
                System.out.println("Answer is 9");
            case 4 * 4:{
                System.out.println("4 ^ 4");
                break mySwitch;
            }
            case 5 * 5:
            lbl2:{
                System.out.println("5 ^ 5");
                break lbl2;
            }
            case 1 * 1:
                System.out.println("1 ^ 1");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
