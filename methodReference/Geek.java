package methodReference;

import java.util.Arrays;

public class Geek {
    public static void print(String s) {
        System.out.println(s);
    };

    public static void main(String[] args) {
        String names[] = { "Bibek", "Alice", "Charlie" };

        Arrays.stream(names).forEach(Geek::print);
    }
}
