import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {

        Queue<Integer> priority = new LinkedList<Integer>();
        priority.add(3);
        priority.add(6);
        priority.add(7);
        priority.add(9);
        priority.add(6);

        CollectionPrintUtility.printElement(priority);

    }
}
