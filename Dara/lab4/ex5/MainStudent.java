package Dara.lab4.ex5;

public class MainStudent {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.setFirstname("With");
        Student1.setLastname("Sofra");
        Student1.setStuID("UUID-0");
        Student1.setAddress("PhnomPenh, Cambodia");
        Student Student2 = new Student("Chandara");
        Student2.setLastname("Yi");
        Student2.setStuID("UUID-0");
        Student2.setAddress("PhnomPenh, Cambodia");
        Student Student3 = new Student("Channudam", "UUID-1");
        Student3.setLastname("Ray");
        Student3.setAddress("PhnomPenh, Cambodia");
        Student Student4 = new Student("phuymeyly", "UUID-2", "Chou");
        Student4.setAddress("Kompong Cham, Cambodia");
        Student Student5 = new Student("vireakyuth", "UUID-3", "Neak", "phnompenh, cambodia");

        Student1.printInfo();
        Student2.printInfo();
        Student4.printInfo();
        Student3.printInfo();
        Student5.printInfo();
    }
}
