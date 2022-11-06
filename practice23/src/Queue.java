public interface Queue {

    // Pre: element != null
    // Post: n = n' + 1 && a[n] = element
    void enqueue(Object element);

    // Pre: size > 0
    // Post: n = n' - 1 && a'[0] = a[0]
    Object dequeue();

    // Pre: size > 0
    // Post: n = n' && a'[0] = a[0]
    Object element();

    // Pre: true
    // Post: n = n' && a'[0] = a[0]
    int size();

    // Pre: true
    // Post: n = n' && a'[0] = a[0]
    boolean isEmpty();

    // Pre: true
    // Post: n = 0
    void clear();
}
