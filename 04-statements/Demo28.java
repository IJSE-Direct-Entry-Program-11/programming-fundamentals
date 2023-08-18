import java.util.ArrayList;
import java.util.Vector;

public class Demo28 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40 };

        Vector<String> names = new Vector<>();
        names.add("Kasun");
        names.add("Nuwan");
        names.add("Ruwan");
        names.add("Sampath");

        ArrayList<Double> marks = new ArrayList<>();
        marks.add(12.50);
        marks.add(25.75);
        marks.add(88.25);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("---------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("---------");
        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }

        // System.out.println(myInts instanceof Iterable);
        System.out.println(names instanceof Iterable);
        System.out.println(marks instanceof Iterable);

        System.out.println();

        int index = 0;
        for (int i : numbers){
            index++;
            System.out.println(i);
        }

        for (String abc : names) System.out.println(abc);

        for (double d : marks){
            System.out.println(d);
        }

        // while(true);
        // for(;;);

        System.out.println();

        names.forEach(elm->{
            System.out.println(elm);
        });

        marks.forEach(elm->{
            System.out.println(marks);
        });
    }
}
