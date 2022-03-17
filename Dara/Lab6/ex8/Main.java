package ex8;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("dara", "khmer", 20, "cadt", "coding");
        Teacher teacher = new Teacher("Vitou Try", "khmer", 28, "cadt", 2000);
        Tiger tiger = new Tiger("Orange", 125.1);
        System.out.println(student);
        System.out.println(teacher);
        System.out.println(tiger);
    }
}
