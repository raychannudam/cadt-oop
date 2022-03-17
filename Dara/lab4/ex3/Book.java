package Dara.lab4.ex3;

public class Book {
    public String title;
    public String author;
    public Boolean isBn;

    Book(){

    }

    Book(String _title){
        title = _title;
    }

    Book(String _title, String _author, Boolean _isBn){
        title = _title;
        author = _author;
        isBn = _isBn;
    }

    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    Boolean getIsBn(){
        return isBn;
    }
}
