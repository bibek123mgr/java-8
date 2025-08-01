import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(6);
        numList.add(7);
        numList.add(7);
        numList.add(3);
        numList.add(5);

        CollectionPrintUtility.printElement(numList);
        Collections.sort(numList);
        CollectionPrintUtility.printElement(numList);
        System.out.println(Collections.binarySearch(numList, 3));

        List<Integer> UnmodifiableCollection = Collections.unmodifiableList(numList);
        System.out.println(UnmodifiableCollection);
    }
}
