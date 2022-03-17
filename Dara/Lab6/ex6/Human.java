package ex6;

import java.util.Scanner;

public class Human implements DoAble{
    private String name, nationality;
    private int age;
    public Human(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //
    public String toString(){
        return this.name+"\t"+this.age+"\t"+this.nationality;
    }

    public void doThis(){
        System.out.println(this.name+" does this");
    }

    public void doThat(){
        System.out.println(this.name+" does that");
    }

    public static Human addData(){
        String name, nationality;
        int age;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input2.nextLine();
        System.out.print("Enter nationality: ");
        nationality = input2.next();
        System.out.print("Enter age: ");
        age = input2.nextInt();
        Human newhuman = new Human(name, nationality, age);
        return newhuman;
    }
}