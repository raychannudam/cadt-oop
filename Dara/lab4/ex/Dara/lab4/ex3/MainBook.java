package ex3;

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("harry potter");
        Book book3 = new Book("The lord of ring", "J.K Rowling", true);

        System.out.println(book1.getTitle()+"\t"+book1.getAuthor()+"\t"+book1.getIsBn());
        System.out.println(book2.getTitle()+"\t"+book2.getAuthor()+"\t"+book2.getIsBn());
        System.out.println(book3.getTitle()+"\t"+book3.getAuthor()+"\t"+book3.getIsBn());

    }
}
