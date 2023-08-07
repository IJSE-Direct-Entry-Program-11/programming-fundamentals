// class: ❌
public class Demo3 {

    //method: ❌
    public static void main(String[] args) {
        
        empty:
        ;
        
        myLabel:    // Label Statement
        {
            // myVar: ❌
            int x = 10;

            anotherLabel:
            x = 20;

            secondLabel:    // Second Label Statement
            System.out.println("Hello");
        }

        thirdLabelStatement:    // Third Label Statement
        System.out.println("IJSE");

        abc:
        if (true) System.out.println("IJSE");

        // test:
        int x;

        test2:
        x = 20;
    }
}
