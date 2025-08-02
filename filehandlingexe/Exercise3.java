import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//frequency means number of occurance
public class Exercise3 {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 3, 4, 5, 2, 1, 3, 4, 5, 6, 7, 8, 9, 12);

        System.out.println(Collections.frequency(intList, 1));
    }
}