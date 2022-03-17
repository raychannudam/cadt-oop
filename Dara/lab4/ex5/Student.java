package Dara.lab4.ex5;

public class Student {
    public String firstname, stuID, lastname,address;
    public Student() {}
    public Student(String firstname) {
        this.firstname = firstname;}
    public Student(String firstname, String stuID) {
        this.firstname = firstname;
        this.stuID = stuID;}
    public Student(String firstname, String stuID, String lastname) {
        this.firstname = firstname;
        this.stuID = stuID;
        this.lastname = lastname;}
    public Student(String firstname, String stuID, String lastname, String address) {
        this.firstname = firstname;
        this.stuID = stuID;
        this.lastname = lastname;
        this.address = address;}
    public String getFirstname() {
        return firstname;}
    public void setFirstname(String firstname) {
        this.firstname = firstname;}
    public String getStuID() {
        return stuID;}
    public void setStuID(String stuID) {
        this.stuID = stuID;}
    public String getLastname() {
        return lastname;}
    public void setLastname(String lastname) {
        this.lastname = lastname;}
    public String getAddress() {
        return address;}
    public void setAddress(String address) {
        this.address = address;}
    void printInfo(){
        System.out.println("ID: "+this.stuID+"\tName: "+this.firstname.concat(this.lastname)+"\tAddress: "+this.address);}
    
    
}
