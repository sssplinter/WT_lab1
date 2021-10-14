package com.sementsova.wt.books;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(
            final String title,
            final String author,
            final int price,
            final int isbn,
            final String language,
            final int level) {

        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    //task13
    @Override
    public boolean equals(Object obj) {
        ProgrammerBook otherBook = (ProgrammerBook) obj;
        return super.equals(obj) && otherBook.language.equals(language) && otherBook.level == level;
    }

    @Override
    public int hashCode() {
        int res = super.hashCode();
        if (language != null) res += language.hashCode();
        res += level;

        return res;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{ " + super.toString() + ", " + language.toString() + ", " + level + " }";
    }
}
