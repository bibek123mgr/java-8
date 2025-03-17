package methodReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListToHashMap {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grapes");
        fruits.add("strowbarrey");

        System.out.println("arrayList" + fruits);

        HashMap<String, Integer> res = fruits.stream()
                .collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1, HashMap::new));
        System.out.println(res);
    }

}
