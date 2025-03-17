import java.util.ArrayList;
import java.util.List;

public class GFG1 {
    public static void main(String[] args) {
        List<String> companyList = new ArrayList<>();
        companyList.add("apple");
        companyList.add("microsft");
        companyList.add("google");

        companyList.stream().sorted().forEach(System.out::println);
    }
}
