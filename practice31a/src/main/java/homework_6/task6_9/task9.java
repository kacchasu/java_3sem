package homework_6.task6_9;

import java.util.ArrayList;

public class task9 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book(1987, "Prestuplenie i nakazanie"));
        list.add(new Book(1887, "Mertvie dushi"));
        list.add(new Book(1787, "Bozhestvenaya comedia"));

        for(int i=0; i<list.size(); i++){
            list.get(i).print();
        }
    }
}
