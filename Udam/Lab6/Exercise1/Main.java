package Udam.Lab6.Exercise1;

public class Main {
    public static void main(String[] args) {
        Human std = new Student("Udam", "19", "KHMER", "CADT", "Computer Science");
        Human tch = new Teacher("Dara", "20", "KHMER", 500.50, "CADT");
        System.out.println(std);
        System.out.println(tch);
    }
}
