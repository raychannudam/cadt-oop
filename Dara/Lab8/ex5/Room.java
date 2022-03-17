package ex5;

import java.util.LinkedList;
import java.util.Scanner;

import ex4.Student;

public class Room {
    static void searchStudent(String id, LinkedList<Student> s){
        for(int i=0;i<s.size();i++){
            if(s.get(i).id.equalsIgnoreCase(id)){
                System.out.println(s.get(i));
            }
        }
    }
    static void removeStudent(String id, LinkedList<Student> s){
        for(int i=0;i<s.size();i++){
            if(s.get(i).id.equalsIgnoreCase(id)){
                s.remove(i);
            }
        }
    }
    static void editStudent(String id, LinkedList<Student> s){
        
        for(int i=0;i<s.size();i++){
            if(s.get(i).id.equalsIgnoreCase(id)){
                Scanner input = new Scanner(System.in);
                String sid, name, address;
                int age;
                System.out.print("Enter student id: ");
                sid = input.nextLine();
                System.out.print("Enter student name: ");
                name = input.nextLine();
                System.out.print("Enter student age: ");
                age = input.nextInt();
                System.out.print("Enter student address: ");
                input.nextLine();
                address = input.nextLine();
                s.get(i).setAge(age);
                s.get(i).setId(sid);
                s.get(i).setName(name);
                s.get(i).setAddress(address);
                input.close();
            }
        }
    }    
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<Student>();
        Student s1 = new Student("01", "dara", "Phnom Penh", 20);
        Student s2 = new Student("02", "udam", "Phnom Penh", 19);
        Student s3 = new Student("03", "venghorng", "Takeo", 18);
        Student s4 = new Student("04", "yuth", "Phnom Penh", 20);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.remove(s2);
        searchStudent("03", studentList);
        editStudent("01", studentList);
        System.out.println(studentList);
    }
}
