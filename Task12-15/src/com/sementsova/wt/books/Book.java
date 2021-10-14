package com.sementsova.wt.books;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition = 12345;
    //task15
    public int isbn;

    public Book(String title, String author, int price, int isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    //task12
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Book otherBook = (Book) obj;
            return otherBook.title.equals(title) && otherBook.author.equals(author);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int res = 1;
        if (title != null) res += title.hashCode();
        if (author != null) res += author.hashCode();
        if (price != 0) res *= price;
        if (edition != 0) res += edition;
        return res;
    }

    @Override
    public String toString() {
        return "Book{" + title + ", " + author + ", " + price + ", " + isbn +" }";
    }

    //task14
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //task15
    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(isbn, otherBook.isbn);
    }

    //task16
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
