package Udam.Lab4.Exercise6;

import java.util.Scanner;

public class BookOperation {

    public void fillData(Book[] bookList) {
        Scanner ac = new Scanner(System.in);
        for (int i = 0; i < bookList.length; i++) {
            ac = new Scanner(System.in);
            bookList[i] = new Book();
            System.out.println("Start " + (i + 1) + " element");
            System.out.print("Input author name: ");
            String author = ac.nextLine();
            bookList[i].set_author(author);
            System.out.print("Input title: ");
            String title = ac.nextLine();
            bookList[i].set_title(title);
            System.out.print("ISBN? : ");
            String isBn = ac.nextLine();
            bookList[i].set_isBn(isBn);
            System.out.print("Publish Year: ");
            Integer publishYear = ac.nextInt();
            bookList[i].set_publishYear(publishYear);
            System.out.println("End " + (i + 1) + " element");
        }
        ac.close();
    }

    public void printAll(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println("Start Element: " + (i + 1));
            System.out.println(bookList[i].get_author());
            System.out.println(bookList[i].get_title());
            System.out.println(bookList[i].get_isBn());
            System.out.println(bookList[i].get_publishYear());
            System.out.println("End Element: " + (i + 1));
        }
    }

    public Book searchBookByTitle(Book[] bookList, String title) {
        for (Book book : bookList) {
            if (book.get_title().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByISBN(Book[] bookList, String isbn) {
        for (Book book : bookList) {
            if (book.get_isBn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Book[] sortBookByTitle(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            for (int j = i + 1; j < bookList.length; j++) {
                if (bookList[i].get_title().compareTo(bookList[j].get_title()) > 0) {
                    Book temp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = temp;
                }
            }
        }
        return bookList;
    }

    public Book[] sortBookByISBN(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            for (int j = i + 1; j < bookList.length; j++) {
                if (bookList[i].get_isBn().compareTo(bookList[j].get_isBn()) > 0) {
                    Book temp = bookList[i];
                    bookList[i] = bookList[j];
                    bookList[j] = temp;
                }
            }
        }
        return bookList;
    }

}
