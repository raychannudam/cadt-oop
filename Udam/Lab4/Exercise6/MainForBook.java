package Udam.Lab4.Exercise6;

public class MainForBook {
    public static void main(String[] args) {
        Book[] bookList = new Book[5];
        BookOperation bookOp = new BookOperation();

        bookOp.fillData(bookList);
        bookOp.printAll(bookList);
        Book searchByTitle = bookOp.searchBookByISBN(bookList, "title");
        if(searchByTitle != null){
            System.out.println("search by title found.");
            System.out.println(searchByTitle.get_author());
            System.out.println(searchByTitle.get_publishYear());
        }
        Book searchByISBN = bookOp.searchBookByISBN(bookList, "isbn");
        if(searchByISBN != null){
            System.out.println("search by ISBN found.");
            System.out.println(searchByISBN.get_author());
            System.out.println(searchByISBN.get_publishYear());
        }
        Book[] sortByTitle = bookOp.sortBookByTitle(bookList);
        for(Book sorted: sortByTitle){
            System.out.print(sorted.get_title()+" ");
        }
        Book[] sortByISBN = bookOp.sortBookByISBN(bookList);
        for(Book sorted: sortByISBN){
            System.out.print(sorted.get_title()+" ");
        }
    
    }
}
