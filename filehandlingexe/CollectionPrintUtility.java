import java.util.Collection;

public class CollectionPrintUtility {

    public static <E> void printElement(Collection<E> collection) {
        for (E col : collection) {
            System.out.printf("%s", col);
            System.out.print(" ");
        }
        System.out.println(" ");

    }
}
