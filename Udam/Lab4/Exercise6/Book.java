package Udam.Lab4.Exercise6;

public class Book {
    private String _isBn;
    private String _title;
    private String _author;
    private int _publishYear;
    public String get_isBn() {
        return _isBn;
    }
    public void set_isBn(String _isBn) {
        this._isBn = _isBn;
    }
    public String get_title() {
        return _title;
    }
    public void set_title(String _title) {
        this._title = _title;
    }
    public String get_author() {
        return _author;
    }
    public void set_author(String _author) {
        this._author = _author;
    }
    public int get_publishYear() {
        return _publishYear;
    }
    public void set_publishYear(int _publishYear) {
        this._publishYear = _publishYear;
    }
    public Book(String _isBn, String _title, String _author, int _publishYear) {
        this._isBn = _isBn;
        this._title = _title;
        this._author = _author;
        this._publishYear = _publishYear;
    }
    public Book(String _isBn, String _title, String _author) {
        this._isBn = _isBn;
        this._title = _title;
        this._author = _author;
    }
    public Book(String _isBn, String _title) {
        this._isBn = _isBn;
        this._title = _title;
    }
    public Book(){}
    public void printInfo(){
        System.out.println("isBn: "+get_isBn());
        System.out.println("title: "+get_title());
        System.out.println("author: "+get_author());
        System.out.println("Publish Year: "+get_publishYear());
    }
}
