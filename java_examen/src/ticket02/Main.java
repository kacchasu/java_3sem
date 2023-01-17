package ticket02;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        var revMap = reverse(map);
        System.out.println(revMap);
    }

    public static <K, V> Map<V, K> reverse(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}
