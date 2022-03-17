package ex6;

public class MainBook implements Comparable<MainBook>{
    public String  ISBN,title, author, publishYear;
    public int id;
    MainBook() {
    }
    MainBook(String iSBN) {
        this.ISBN = iSBN;}

    MainBook(String iSBN, String title) {
        this.ISBN = iSBN;
        this.title = title;}
    MainBook(String iSBN, String title, String author) {
        ISBN = iSBN;
        this.title = title;
        this.author = author;}
    MainBook(String iSBN, String title, String author, String publishYear) {
        ISBN = iSBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;}
    public String toString() {
        return this.ISBN + " " + this.title + " " + this.author + " " + this.publishYear;}
    public String getISBN() {
        return ISBN;}

    public void setISBN(String iSBN) {
        ISBN = iSBN;}
    public String getTitle() {
        return this.title;}
    public void setTitle(String title) {
        this.title = title;}
    public String getAuthor() {
        return author;}
    public void setAuthor(String author) {
        this.author = author;}
    public String getPublishYear() {
        return publishYear;}
    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;}
    @Override
    public int compareTo(MainBook book){
        return  this.id;}
}
