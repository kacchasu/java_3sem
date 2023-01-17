package ticket26;

public class ArrayList {
    private int[] elements;
    private int size;

    public ArrayList() {
        elements = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == elements.length) {
            int[] temp = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        elements[size] = value;
        size++;
    }

    public void add(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == elements.length) {
            int[] temp = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = value;
        size++;
    }

    public void clear() {
        size = 0;
    }

    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int lastIndexOf(int value) {
        for (int i = size - 1; i >= 0; i--) {
            if (elements[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int value = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return value;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.isEmpty());
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
        list.remove(1);
        System.out.println(list.get(1));
        list.clear();
        System.out.println(list.isEmpty());
    }
}
