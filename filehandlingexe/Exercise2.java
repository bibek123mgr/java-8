import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise2 {

    public static void sortListOfStringInDesc(List<String> stringList) {
        // Collections.sort(stringList);

        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2.equals(o1)) {
                    return 0;
                } else if (o1.charAt(0) < o2.charAt(0)) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

    }

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Bear", "Lion", "Ant");
        System.out.println(strList);
        sortListOfStringInDesc(strList);
        System.out.println(strList);

    }
}
