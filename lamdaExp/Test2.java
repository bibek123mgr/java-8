import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Element of ArrayList :");
        arr.forEach(n -> System.out.println(n));

        System.out.println("Print Even ELements:");

        arr.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

    }
}
