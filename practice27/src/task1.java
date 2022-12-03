import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class task1 {
    // Общий метод для создания нового `TreeSet` из `HashSet`
    public static <T> Set<T> getInstance(Set<T> hashSet)
    {
        Set<T> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);

        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("RED");
        hashSet.add("BLUE");
        hashSet.add("GREEN");

        // создаем новый `TreeSet` из `HashSet`
        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}
