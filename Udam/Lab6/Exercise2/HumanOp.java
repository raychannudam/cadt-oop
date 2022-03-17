package Udam.Lab6.Exercise2;

import Udam.Lab6.Exercise1.Human;
import Udam.Lab6.Exercise1.Student;
import Udam.Lab6.Exercise1.Teacher;

public class HumanOp {
    public Human humanList[] = new Human[10];
    int index = 0;

    public Student addHuman(String name, String age, String nationality, String schoolName, String skill) {
        for (int i = 0; i < humanList.length; i++) {
            if (humanList[i] == null) {
                index = i;
                break;
            }
        }
        humanList[index] = null;
        Student std = new Student(name, age, nationality, schoolName, skill);
        humanList[index] = std;
        return std;
    }

    public Teacher addHuman(String name, String age, String nationality, double salary, String schoolName) {
        for (int i = 0; i < humanList.length; i++) {
            if (humanList[i] == null) {
                index = i;
                break;
            }
        }
        humanList[index] = null;
        Teacher tch = new Teacher(name, age, nationality, salary, schoolName);
        humanList[index] = tch;
        return tch;
    }

    public Human searchByName(String name) {
        for (int i = 0; i < humanList.length; i++) {
            if (humanList[i] != null) {
                if (humanList[i].get_name().equals(name)) {
                    return humanList[i];
                }
            }
        }
        return null;
    }

    public Human editByName(String name, String age, String nationality, String schoolName, String skill) {
        for (int i = 0; i < humanList.length; i++) {
            if (humanList[i].get_name().equals(name)) {
                humanList[i] = new Student(name, age, nationality, schoolName, skill);
                return humanList[i];
            }
        }
        return null;
    }

    public Human editByName(String name, String age, String nationality, double salary, String schoolName) {
        for (int i = 0; i < humanList.length; i++) {
            if (humanList[i].get_name().equals(name)) {
                humanList[i] = new Teacher(name, age, nationality, salary, schoolName);
                return humanList[i];
            }
        }
        return null;
    }

    public void printAll() {
        for (Human human : humanList) {
            System.out.println(human);
        }
    }
}
