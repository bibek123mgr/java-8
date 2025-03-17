import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GfG {

    public static void main(String[] args) {
        List<String> companyList = new ArrayList<>();

        companyList.add("company 1");
        companyList.add("company 3");
        companyList.add("company 2");

        Comparator<String> com = (String o1, String o2) -> o1.compareTo(o2);

        Collections.sort(companyList, com);
        for (String name : companyList) {
            System.out.println(name);
        }

    }
}