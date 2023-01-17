package ticket08;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void mystery(Map<String, String> map) {
        Map<String, String> result = new TreeMap<String, String>();
        for (String key : map.keySet()) {
            if(key.compareTo(map.get(key)) < 0) {
                result.put(key, map.get(key));
            } else {
                result.put(map.get(key), key);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Test test = new Test();
        Map<String, String> map1 = new TreeMap<String, String>();
        map1.put("two", "deux");
        map1.put("five", "cinq");
        map1.put("one", "un");
        map1.put("three", "trois");
        map1.put("four", "quatre");
        Map<String, String> map2 = new TreeMap<String, String>();
        map2.put("skate", "board");
        map2.put("drive", "car");
        map2.put("program", "computer");
        map2.put("play", "computer");
        Map<String, String> map3 = new TreeMap<String, String>();
        map3.put("siskel", "ebert");
        map3.put("girl", "boy");
        map3.put("heads", "tails");
        map3.put("ready", "begin");
        map3.put("first", "last");
        map3.put("begin", "end");
        Map<String, String> map4 = new TreeMap<String, String>();
        map4.put("cotton", "shirt");
        map4.put("tree", "violin");
        map4.put("seed", "tree");
        map4.put("light", "tree");
        map4.put("rain", "cotton");
        test.mystery(map1);
        test.mystery(map2);
        test.mystery(map3);
        test.mystery(map4);
    }
}
