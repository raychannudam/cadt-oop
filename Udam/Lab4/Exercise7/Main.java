package Udam.Lab4.Exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] studentList = new Student[3];
        fillData(studentList);
        printAll(studentList);
        if(searchStudentById(studentList, "id")!=null){
            System.out.println("ID found");
        }
        if(searchStudentByName(studentList, "name")!=null){
            System.out.println("Name found");
        }
        Student[] stdLst = sortByName(studentList);
        for(Student lst: stdLst){
            System.out.print(lst.get_name());
        }
        System.out.println();
        stdLst = sortById(studentList);
        for(Student lst: stdLst){
            System.out.print(lst.get_name());
        }
        System.out.println();
    }

    public static void fillData(Student[] studentList){
        Scanner ac = new Scanner(System.in);
        int counter = 1;
        for(Student student: studentList){
            System.out.println("**Student "+(counter)+" **");
            student = new Student();
            ac = new Scanner(System.in);
            System.out.print("Input name of student ");
            String name = ac.nextLine();
            student.set_name(name);
            System.out.print("Input department: ");
            String department = ac.nextLine();
            student.set_department(department);
            System.out.print("Input generation: ");
            String generation = ac.nextLine();
            student.setGeneration(generation);
            String id = "CADT-" + student.get_name().charAt(counter) + Math.random()*90+10;
            student.set_id(id);
            counter++;
        }
        ac.close();
    }

    public static void printAll(Student[] studentList){
        for(Student student: studentList){
            student.printInfo();
        }
    }

    public static Student searchStudentByName(Student[] studentList, String name){
        for(Student student: studentList){
            if(student.get_name().equals(name)){
                return student;
            }
        }
        return null;
    }

    public static Student searchStudentById(Student[] studentList, String id){
        for(Student student: studentList){
            if(student.get_id().equals(id)){
                return student;
            }
        }
        return null;
    }

    public static Student[] sortByName(Student[] studentList){
        for(int i=0; i<studentList.length; i++){
            for(int j=i+1; j<studentList.length; j++){
                if(studentList[i].get_name().compareTo(studentList[j].get_name()) > 0){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
        return studentList;
    }

    public static Student[] sortById(Student[] studentList){
        for(int i=0; i<studentList.length; i++){
            for(int j=i+1; j<studentList.length; j++){
                if(studentList[i].get_id().compareTo(studentList[j].get_id()) > 0){
                    Student temp = studentList[i];
                    studentList[i] = studentList[j];
                    studentList[j] = temp;
                }
            }
        }
        return studentList;
    }

}
