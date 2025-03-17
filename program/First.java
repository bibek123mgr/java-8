import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class First {

    public static <K, V> Stream<Map.Entry<K, V>> convertMapToStream(Map<K, V> map) {
        return map
                .entrySet()
                .stream();
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(12, "bibek");
        map.put(23, "magar");
        map.put(44, "kumar");

        System.out.println("map " + map);

        Stream<Map.Entry<Integer, String>> stream = convertMapToStream(map);

        System.out.println("stream :" + Arrays.toString(stream.toArray()));
    }
}