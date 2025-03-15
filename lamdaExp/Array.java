import java.util.Arrays;

public class Array {
    public static void Print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String name[] = { "bibek", "kumar", "bakabal" };
        Arrays.stream(name).forEach(Array::Print);
    }
}
