package Dara.lab4.ex6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class isBnComparator implements Comparator<MainBook> {
   
    @Override
    public int compare(MainBook book1, MainBook book2) {
        return book1.getISBN().compareTo(book2.getISBN());
    }
  }

class titleComparator implements Comparator<MainBook> {
   
    @Override
    public int compare(MainBook book1, MainBook book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
  }


public class MainBook implements Comparable<MainBook>{
    public String  ISBN,title, author, publishYear;
    public int id;
    MainBook() {
    }

    MainBook(String iSBN) {
        this.ISBN = iSBN;
    }

    MainBook(String iSBN, String title) {
        this.ISBN = iSBN;
        this.title = title;
    }

    MainBook(String iSBN, String title, String author) {
        ISBN = iSBN;
        this.title = title;
        this.author = author;
    }

    MainBook(String iSBN, String title, String author, String publishYear) {
        ISBN = iSBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String toString() {
        return this.ISBN + " " + this.title + " " + this.author + "" + this.publishYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }
    @Override
    public int compareTo(MainBook book){
        return  this.id;
    }
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
        input.close();
    }

    static void printAll(MainBook[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + " ");
        }
    }

    static MainBook searchBookByTitle(MainBook[] books, String title) {

        for (MainBook book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    static MainBook searchBookByISBN(MainBook[] books, String ISBN) {

        for (MainBook book : books) {
            if (book.getISBN().equals(ISBN)) {
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
}

