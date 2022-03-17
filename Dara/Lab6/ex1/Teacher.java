package ex1;

import java.util.Scanner;

public class Teacher extends Human{
    float salary;
    String schoolName;
    public Teacher(String name, String nationality, int age, float salary, String schoolName) {
        super(name, nationality, age);
        this.salary = salary;
        this.schoolName = schoolName;
    }
    public String toString(){
        return this.getName()+"\t"+this.getAge()+"\t"+this.getNationality()+"\t"+this.schoolName+"\t$"+this.salary+"\t"+this.getResponsible();
    }
    public String getResponsible(){
        return "Teach";
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public static Teacher addData() {
        String name, nationality;
        int age;
        String schoolName;
        float salary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter nationality: ");
        nationality = input.next();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter School Name: ");
        input.nextLine();
        schoolName = input.nextLine();
        System.out.print("Enter Salary: ");
        salary= input.nextFloat();
        Teacher newTeacher = new Teacher(name, nationality, age, salary,schoolName);
        return newTeacher;
    }
}
