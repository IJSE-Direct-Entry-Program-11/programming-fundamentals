import java.util.Scanner;

public class Demo20 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "";
        double marks1 = 0;
        double marks2 = 0;
        double marks3 = 0;
        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            if (name.isBlank()){
                System.out.println("Name can't be empty");
            }
        }while(name.isBlank());

        int x = 0;
        do{
            System.out.printf("Enter your marks for subject%s: ", x+1);
            double marks = scanner.nextDouble();
            scanner.nextLine();

            if (marks < 0 || marks > 100){
                System.out.println("Invalid marks");
            }else{
                if (x == 1) marks1 = marks;
                else if (x ==2 ) marks2 = marks;
                else marks3 = marks;
                x++;
            }
        }while(x < 3);   
        
        double total = marks1 + marks2 + marks3;
        System.out.printf("%s Total Marks = %.2f\n", name.strip(), total);
        System.out.printf("%s Avg. Marks = %.2f%%\n", name.strip(), total / 3.0);
    }
}
