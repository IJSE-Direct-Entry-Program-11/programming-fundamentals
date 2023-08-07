public class Demo5 {
    public static void main(String[] args) {

        int x = 4;
        System.out.println("Hello");

        assert 5 == ++x;
        assert 10 > 5 : "My Message";
        assert 0 == 100: "Something went wrong";

        System.out.println("Welcome!");
        System.out.println(x);

    }
}
