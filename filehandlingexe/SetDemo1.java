import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> namSet = new HashSet<>();
        namSet.add("bibek");
        namSet.add("kumar");
        namSet.add("bakabal");

        System.out.println(namSet.size());
        CollectionPrintUtility.printElement(namSet);
        namSet.remove("bibek");
        CollectionPrintUtility.printElement(namSet);
        System.out.println(namSet.contains("bibek"));
        System.out.println(namSet.isEmpty());

    }
}
