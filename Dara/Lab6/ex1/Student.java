package ex1;

import java.util.Scanner;

public class Student extends Human {
    String schoolName, skill;

    public Student() {}

    public Student(String name, String nationality, int age, String schoolName, String skill) {
        super(name, nationality, age);
        this.schoolName = schoolName;
        this.skill = skill;
    }

    public String toString() {
        return this.getName() + "\t" + this.getAge() + "\t" + this.getNationality() + "\t" + this.schoolName + "\t"
                + this.skill + "\t" + this.getResponsible();
    }

    public String getResponsible() {
        return "Study";
    }

    public static Student addData() {
        String name, nationality;
        int age;
        String schoolName, skill;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input2.nextLine();
        System.out.print("Enter nationality: ");
        nationality = input2.next();
        System.out.print("Enter age: ");
        age = input2.nextInt();
        System.out.print("Enter School Name: ");
        input2.nextLine();
        schoolName = input2.nextLine();
        System.out.print("Enter Skill: ");
        skill = input2.nextLine();
        Student newStu = new Student(name, nationality, age, schoolName, skill);
        return newStu;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

}