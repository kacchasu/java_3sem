package ticket04;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var set = Set.of(2, 4, 10, 16);
        System.out.println(hasOdd(set));
        set = Set.of(2, 4, 10, 16, 30001);
        System.out.println(hasOdd(set));
        set = Set.of();
        System.out.println(hasOdd(set));
    }

    public static boolean hasOdd(Set<Integer> set) {
        var result = false;
        for (var i : set) {
            if (i % 2 == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
}
