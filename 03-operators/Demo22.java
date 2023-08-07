public class Demo22 {
    public static void main(String[] args) {
        double x = 10 % 7.0;
        System.out.println(x);

        double y = -10 % 7.0;
        System.out.println(y);

        int a = 10;
        int b = 20;
        int c = 30;

        String result = a + b + "" + c;
        System.out.println(result);

        int d = 1 << 31;
        System.out.println(d);

        Animal1 abc = new Cat1();
        System.out.println(abc instanceof Animal1);
        System.out.println(abc instanceof Cat1);
        System.out.println(abc instanceof Dog1);
        // System.out.println(abc instanceof Box1);

        System.out.println(false == true);
        System.out.println(1.0 == 25);
    }
}

class Animal1 {}
class Dog1 extends Animal1 {}
class Cat1 extends Animal1 {}
class Box1 {}
