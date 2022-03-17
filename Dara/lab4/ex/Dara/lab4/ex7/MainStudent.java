package ex7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
class idComparator implements Comparator<Student> {
   
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getId().compareTo(s2.getId());
    }
  }

class nameComparator implements Comparator<Student> {
   
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
  }
public class MainStudent {

    static void fillData(Student[] student) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < student.length; i++) {
            System.out.print("Enter the ID: ");
            student[i].setId(input.next());
            System.out.print("Enter the name: ");
            input.nextLine();
            student[i].setName(input.nextLine());
            System.out.print("Enter the department: ");
            student[i].setDepartment(input.nextLine());
            System.out.print("Enter the generation: ");
            student[i].setGen(input.nextInt());
        }
        input.close();
    }

    static void printAll(Student[] stundents) {
        for (Student student : stundents) {
            System.out.println(student + " ");
        }
    }

    static Student searchByName(Student[] students, String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    static Student searchByid(Student[] students, String id) {
        for (Student student : students) {
            if (student.id.equals(id)) {
                return student;
            }
        }
        return null;
    }

    static void sortStudentById(Student[] students){
        printAll(students);
        Arrays.sort(students, new idComparator());
    }

    static void sortStudentByname(Student[] students){
        printAll(students);
        Arrays.sort(students, new nameComparator());
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student[] students = { student1, student2, student3, student4 };
        fillData(students);
        printAll(students);
        System.out.println(searchByName(students, "dara"));
        System.out.println(searchByid(students, "4"));
        sortStudentById(students);
        sortStudentByname(students);
        printAll(students);
    }
}
