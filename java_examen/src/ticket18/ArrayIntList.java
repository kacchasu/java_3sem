package ticket18;

public class ArrayIntList {
    private int[] elementData;
    private int size;

    public ArrayIntList(int length) {
        elementData = new int[length];
        size = 0;
    }

    public void add(int value) {
        if (size == elementData.length) {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }
        elementData[size] = value;
        size++;
    }

    public int longestSortedSequence() {
        if (size == 0) {
            return 0;
        }
        var max = 1;
        var current = 1;
        for (int i = 0; i < size - 1; i++) {
            if (elementData[i] < elementData[i + 1]) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                current = 1;
            }
        }
        return max;
    }
}
