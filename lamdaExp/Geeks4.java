import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Geeks4 {
    public static void main(String[] args) {

        List<String> personList = new ArrayList<String>();
        personList.add("bibek");
        personList.add("kumar");
        personList.add("bakabal");
        personList.add("magar");

        Collections.sort(personList, String::compareToIgnoreCase);
        personList.forEach(System.out::println);
    }
}
