import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("bibek");
        stringList.add("kumar");
        stringList.add("bakabal");

        // stringList.set(2, "bibek");
        // System.out.println(stringList.contains("bibek"));
        // System.out.println(stringList.indexOf("bibek"));
        // System.out.println(stringList.get(2));

        // System.out.println(stringList.size());
        // System.out.println(stringList.get(0));

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
    }

}
