package ticket21;

public class SearchAlgorithms {
    public static <T extends Comparable<T>> int linearSearch(Valuable<T>[] values, Valuable<T> value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue().compareTo(value.getValue()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int binarySearch(Valuable<T>[] values, Valuable<T> value) {
        int low = 0;
        int high = values.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = values[mid].getValue().compareTo(value.getValue());
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
