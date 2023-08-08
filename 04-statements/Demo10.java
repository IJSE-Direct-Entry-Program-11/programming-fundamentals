import java.util.Scanner;

public class Demo10 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        if (year < 2000 || year > 2030){
            System.out.println("Invalid year, enter a year between 2000 and 2030");
            System.exit(1);
        }

        boolean leapYear = year % 4 == 0;

        System.out.print("Enter the month: ");
        String month = scanner.nextLine();

        int days = 0;

        switch(month.strip().toUpperCase()){
            case "1": case "JAN": case "JANUARY":
                days = 31;
            case "2": case "FEB": case "FEBRUARY":
                days += (leapYear) ? 29: 28;
            case "3": case "MAR": case "MARCH":
                days += 31;
            case "4": case "APR": case "APRIL":
                days += 30;
            case "5": case "MAY":
                days += 31;
            case "6": case "JUN": case "JUNE":
                days += 30;
            case "7": case "JUL": case "JULY":
                days += 31;
            case "8": case "AUG": case "AUGUST":
                days += 30;
            case "9": case "SEP": case "SEPTEMBER":
                days += 31;
            case "10": case "OCT": case "OCTOBER":
                days += 31;
            case "11": case "NOV": case "NOVEMBER":
                days += 30;
            case "12": case "DEC": case "DECEMBER":
                days += 31;
                break;
            default:
                System.out.println("Invalid month");
                System.exit(2);
        }
        System.out.printf("Total number of remaining days: %s \n", days);
    }
}
