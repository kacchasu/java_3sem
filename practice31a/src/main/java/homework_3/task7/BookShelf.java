package homework_3.task7;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    int n = 0; 

    public BookShelf(int n, Book[] books) {
        this.n = n;
        this.books = books;
    }

    Book[] books;

    public BookShelf(int n) {
        this.n = n;
        books = new Book[n];
    }
    public Book last(){
        Book max = books[0];
        for (Book book : books){
            if(book.getYear()>max.getYear()){
                max = book;
            }
        }
        return max;
    }
    public Book first(){
        Book min = books[0];
        for (Book book : books){
            if(book.getYear()<min.getYear()){
                min = book;
            }
        }
        return min;
    }

    public static Comparator<Book> nameComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return (int) (o1.getYear() - o2.getYear());
        }
    };

    public void sort(){
        Arrays.sort(books, BookShelf.nameComparator);
    }
    public void print(){
        for(int i=0; i<n; i++){
            System.out.println(books[i].toString());
        }
    }
}
