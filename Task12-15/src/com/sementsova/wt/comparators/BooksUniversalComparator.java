package com.sementsova.wt.comparators;

import com.sementsova.wt.books.Book;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class BooksUniversalComparator {

    public TreeSet<Book> compareByIsbn(List<Book> booksList){
        return new TreeSet<>(booksList);
    }

    public TreeSet<Book> compareByTitle(List<Book> booksList) {
        return compareBooks(booksList, new BookTitleComparator());
    }

    public TreeSet<Book> compareByTitleThanByAuthor(List<Book> booksList) {
        return compareBooks(booksList, new BookTitleComparator().thenComparing(new BookAuthorComparator()));
    }

    public TreeSet<Book> compareByAuthorThanByTitle(List<Book> booksList) {
        return compareBooks(booksList, new BookAuthorComparator().thenComparing(new BookTitleComparator()));
    }

    public TreeSet<Book> compareByAuthorByTitleByPrice(List<Book> booksList) {
        return compareBooks(booksList, new BookAuthorComparator().thenComparing(new BookTitleComparator()).thenComparing(new BookPriceComparator()));
    }

    private TreeSet<Book> compareBooks(List<Book> booksList, Comparator<Book> comparator) {
        TreeSet<Book> booksCatalog = new TreeSet<>(comparator);
        booksCatalog.addAll(booksList);
        return booksCatalog;
    }
}
