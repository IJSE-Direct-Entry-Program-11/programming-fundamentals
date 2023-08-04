public class Demo20 {
    public static void main(String[] args) {
        
        int x = 5;
        int y = 2;

        boolean result = x > y;
        System.out.println(result);

        // gt   >
        // lt   <
        // gte  >=
        // lte  <=
        System.out.println();

        System.out.println(new Dog() instanceof Dog);
        System.out.println(new Dog() instanceof Animal);
        // System.out.println(new Box() instanceof Animal);
        System.out.println(new Box() instanceof Object);
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
class Box {}