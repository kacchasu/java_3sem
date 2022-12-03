import java.util.ArrayList;

public class hashtab {
    public ArrayList<String> keys = new ArrayList<>();
    public ArrayList<String> values = new ArrayList<>();

    public void put(String key, String value) {
        if (this.keys.contains(key)) {
            this.values.set(this.keys.indexOf(key), value);
        } else {
            this.keys.add(key);
            this.values.add(value);
        }
    }

    public String get(String key) {
        return this.values.get(this.keys.indexOf(key));
    }

    public void remove(String key) {
        this.values.remove(this.keys.indexOf(key));
        this.keys.remove(key);
    }

    public void sort() {
        for (int i = 0; i < this.keys.size(); i++) {
            for (int j = 0; j < this.keys.size() - 1; j++) {
                if (this.keys.get(j).compareTo(this.keys.get(j + 1)) > 0) {
                    String temp = this.keys.get(j);
                    this.keys.set(j, this.keys.get(j + 1));
                    this.keys.set(j + 1, temp);
                    temp = this.values.get(j);
                    this.values.set(j, this.values.get(j + 1));
                    this.values.set(j + 1, temp);
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.keys.size(); i++) {
            System.out.println(this.keys.get(i) + " " + this.values.get(i));
        }
    }

    public static void main(String[] args) {
        hashtab map = new hashtab();
        map.put("name", "itto");
        map.put("surname", "arataki");
        map.put("age", "21");
        System.out.println(map.get("name"));
        System.out.println(map.get("surname"));
        System.out.println(map.get("age"));
        map.sort();
        map.print();
        map.remove("age");
        map.print();

    }
}
