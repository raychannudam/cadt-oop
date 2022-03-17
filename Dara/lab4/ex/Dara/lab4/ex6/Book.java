package ex6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class isBnComparator implements Comparator<MainBook> {
    @Override
    public int compare(MainBook book1, MainBook book2) {
        return book1.getISBN().compareTo(book2.getISBN());}}

class titleComparator implements Comparator<MainBook> {
    @Override
    public int compare(MainBook book1, MainBook book2) {
        return book1.getTitle().compareTo(book2.getTitle());}}

public class Book {
    static void fillData(MainBook book[]) {
        Scanner input = new Scanner(System.in);
        String ISBN, title, author, publishYear;
        for (int i = 0; i < book.length; i++) {
            System.out.print("Enter the ISBN: ");
            ISBN = input.next();
            book[i].setISBN(ISBN);
            System.out.print("Enter the title: ");
            input.nextLine();
            title = input.nextLine();
            book[i].setTitle(title);
            System.out.print("Enter the author: ");
            author = input.nextLine();
            book[i].setAuthor(author);
            System.out.print("Enter the publishYear: ");
            publishYear = input.next();
            book[i].setPublishYear(publishYear);
        }
        input.close();}

    static void printAll(MainBook[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + " ");}}

    static MainBook searchBookByTitle(MainBook[] books, String title) {
        for (MainBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title))
                return book;}
        return null;}

    static MainBook searchBookByISBN(MainBook[] books, String ISBN) {

        for (MainBook book : books) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                return book;
            }
        }
        return null;
    }
    static void sortBooksByISBN(MainBook[] books) {
        printAll(books);
        Arrays.sort(books, new isBnComparator());
        printAll(books);
    }
    static void sortTitle(MainBook[] books) {
        printAll(books);
        Arrays.sort(books, new titleComparator());
        printAll(books);
    }
    public static void main(String[] args) {
        MainBook book1 = new MainBook();
        MainBook book2 = new MainBook();
        MainBook book3 = new MainBook();
        MainBook book4 = new MainBook();
        MainBook book5 = new MainBook();
        MainBook book[] = {book1,book2,book3,book4,book5};
        fillData(book);
    }
    
}
