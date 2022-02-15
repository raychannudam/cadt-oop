package Udam.Lab4.Exercise3;

public class Book {
    private String _title = "";
    private String _author = "";
    private String _isBn = "";

    public String getTitle(){
        return this._title;
    }
    public void setTitle(String title){
        this._title = title;
    }

    public String getAuthor(){
        return this._author;
    }
    public void setAuthor(String author){
        this._author = author;
    }

    public String getIsBn(){
        return this._isBn;
    }
    public void setIsBn(String isBn){
        this._isBn = isBn;
    }
    
    public Book(){}
    public Book(String title, String author, String isBn){
        this._title = title;
        this._author = author;
        this._isBn = isBn;
    }
    public Book(String title){
        this._title = title;
    }
}
