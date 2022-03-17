package Dara.lab4.ex6;

import java.util.Arrays;

public class Book {
    public static void main(String[] args) {

        MainBook book1 = new MainBook("121201","Harrypotter","j.k rowling","1992");
        MainBook book2 = new MainBook("asbcas123", "mission impossible", "tom cruise", "2022");
        MainBook book3 = new MainBook("c-123", "whatever movie", "whoever author", "whichever year");
        // MainBook book4 = new MainBook();
        // MainBook book5 = new MainBook();

        MainBook book[] = {book1,book2,book3};
        MainBook.sortTitle(book);
        // MainBook.sortTitle(book, new titleComparator());
        // MainBook.fillData(book);
        // MainBook.sortBooks(book);
        // System.out.println(MainBook.searchBookByTitle(book, "harrypotter"));
        // System.out.println(MainBook.searchBookByISBN(book, "121201"));
        // MainBook.sortByISBN(book);
        // MainBook.printAll(book);
    }
    
}
