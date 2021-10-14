package com.sementsova.wt;

import com.sementsova.wt.books.Book;
import com.sementsova.wt.comparators.BooksUniversalComparator;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        testTask16();
    }

    public static void testTask16() {
        ArrayList<Book> booksList = generateBooksList();
        BooksUniversalComparator comparator = new BooksUniversalComparator();
        TreeSet<Book> set;

        //sort by isbn
        set = comparator.compareByIsbn(booksList);
        System.out.println(set);
        //sort by title
        set = comparator.compareByTitle(booksList);
        System.out.println(set);
        //sort by title then by author
        set = comparator.compareByTitleThanByAuthor(booksList);
        System.out.println(set);
        //sort by author then by title
        set = comparator.compareByAuthorThanByTitle(booksList);
        System.out.println(set);
        //sort by author then by title then by price
        set = comparator.compareByAuthorByTitleByPrice(booksList);
        System.out.println(set);
    }

    public static ArrayList<Book> generateBooksList() {
        ArrayList<Book> booksList = new ArrayList<Book>();
        booksList.add(new Book("Rage", "King", 123, 3));
        booksList.add(new Book("Carrie", "King", 54, 11));
        booksList.add(new Book("Crime and Punishment", "Dostoevsky", 84, 5));
        booksList.add(new Book("The picture of Dorian Gray", "Wilde", 160, 13));
        booksList.add(new Book("Cancel", "NoName", 80, 13));
        booksList.add(new Book("Z", "NoName", 78, 19));
        booksList.add(new Book("Z", "NoName", 15, 12));

        return booksList;
    }
}
