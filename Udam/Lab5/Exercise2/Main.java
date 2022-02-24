package Udam.Lab5.Exercise2;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Udam", 19);
        Student s1 = new Student("Dara", 20, "CADT001", "CADT", "Computer Science");
        h1.printAll();
        s1.printAll();
    }
}
