package Books.src;

import java.util.Comparator;

public class BooksComparator implements Comparator<Book> {
    @Override
    public int compare(Book bookFirst, Book bookSecond){
        return bookFirst
                .getPublHouse()
                .compareTo(bookSecond.getPublHouse());
    }
}