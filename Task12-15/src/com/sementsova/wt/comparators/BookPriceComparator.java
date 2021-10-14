package com.sementsova.wt.comparators;

import com.sementsova.wt.books.Book;
import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    public int compare(Book book1, Book book2){
        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
}
