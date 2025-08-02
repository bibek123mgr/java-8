import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 3, 4, 5, 2, 1, 3, 4, 5, 6, 7, 8, 9, 12);
        System.out.println(intList);
        reverseElements(intList);
        System.out.println(intList);
    }

    public static void reverseElements(List<Integer> integersList) {
        // Collections.reverse(integersList);

        for (int i = 0; i < integersList.size() / 2; i++) {
            swapElement(integersList, i, integersList.size() - 1 - i);
        }

    }

    public static void swapElement(List<Integer> integersList, int index1, int index2) {
        int swap = integersList.get(index1);
        integersList.set(index1, integersList.get(index2));
        integersList.set(index2, swap);
    }
}
