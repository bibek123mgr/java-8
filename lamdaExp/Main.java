import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Items {

    private Integer key;
    private String value;

    public Items(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Items> list = new ArrayList<Items>();
        list.add(new Items(10, "bibek"));
        list.add(new Items(20, "magar"));
        list.add(new Items(40, "bakabal"));

        Map<Integer, String> map = new HashMap<>();

        list.forEach((n) -> {
            map.put(n.getKey(), n.getValue());
        });

        System.out.println(map);
    }
}
