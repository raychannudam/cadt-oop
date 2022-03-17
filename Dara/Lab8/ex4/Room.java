package ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Room {
    
    static void searchStudent(String id, HashMap<String, Student> s) {
        Set<Map.Entry<String, Student>> students = s.entrySet();
        for (Map.Entry<String, Student> student : students) {
            if (student.getKey().equalsIgnoreCase(id)) {
                System.out.println(student.getValue());
            }
        }
    }

    static void removeStudent(String id, HashMap<String, Student> s) {
        s.remove(id);
    }

    static void editStudent(String id, HashMap<String, Student> s) {
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
        Student newStu = new Student(sid, name, address, age);
        s.replace(id, newStu);
        input.close();
    }

    public static void main(String[] args) {
        HashMap<String, Student> room = new HashMap<String, Student>();
        Student s1 = new Student("01", "dara", "Phnom Penh", 20);
        Student s2 = new Student("02", "udam", "Phnom Penh", 19);
        Student s3 = new Student("03", "venghorng", "Takeo", 18);
        Student s4 = new Student("04", "yuth", "Phnom Penh", 20);

        room.put(s1.getId(), s1);
        room.put(s2.getId(), s2);
        room.put(s3.getId(), s3);
        room.put(s4.getId(), s4);
        searchStudent("01", room);
        editStudent("01", room);
        removeStudent("03", room);
        Set<Map.Entry<String, Student>> students = room.entrySet();

        for (Map.Entry<String, Student> student : students) {
            System.out.println(student.getKey());
            Student stu = student.getValue();
            System.out.println(stu);
        }
    }
}
