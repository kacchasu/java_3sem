package task3;

import java.io.Serializable;

public class task3<T extends Comparable<T>, V extends Animal & Serializable, K>{
    private T t;
    private V v;
    private K k;

    public task3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "task3{" +
                "t=" + t +
                ", v=" + v +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        task3<Integer, Cat, String> task3 = new task3<Integer, Cat, String> (1, new Cat("2", 3, "black"), "4");
        System.out.println(task3);
    }
}
