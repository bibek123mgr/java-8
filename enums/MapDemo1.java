import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("Nepal", "Kathmandu");
        countryMap.put("India", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("USA", "Washington, D.C.");
        countryMap.put("UK", "London");
        countryMap.put("France", "Paris");
        countryMap.put("Germany", "Berlin");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Australia", "Canberra");
        countryMap.put("Canada", "Ottawa");
        try {
            Scanner sc = new Scanner(System.in);
            String country = sc.next();
            String capital = countryMap.get(country);

            System.out.println(capital);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
