package Udam.Lab6.Exercise2;

import java.util.Scanner;

import Udam.Lab6.Exercise1.Human;
import Udam.Lab6.Exercise1.Student;

public class Main {
    public static void main(String[] args) {
        HumanOp operation = new HumanOp();
        Scanner ac = new Scanner(System.in);
        while (true){
            printMenu();
            System.out.print("Input your option: ");
            int input = ac.nextInt();
            if(input == 1){
                ac = new Scanner(System.in);
                System.out.print("Student name: ");
                String sName = ac.nextLine();
                System.out.print("Student age: ");
                String sAge = ac.nextLine();
                System.out.print("Student nationality: ");
                String sNationality = ac.nextLine();
                System.out.print("Student schoolName: ");
                String sSchoolName = ac.nextLine();
                System.out.print("Student skill: ");
                String sSkill = ac.nextLine();
                operation.addHuman(sName, sAge, sNationality, sSchoolName, sSkill); 
                System.out.println("Student Created Successfully");
                System.out.print("\033[H\033[2J");  
                System.out.flush();
            }else if(input == 2){
                ac = new Scanner(System.in);
                System.out.print("Teacher name: ");
                String tName = ac.nextLine();
                System.out.print("Teacher age: ");
                String tAge = ac.nextLine();
                System.out.print("Teacher nationality: ");
                String tNationality = ac.nextLine();
                System.out.print("Teacher schoolName: ");
                String tSchoolName = ac.nextLine();
                System.out.print("Teacher salary: ");
                Double tSalary = ac.nextDouble();
                operation.addHuman(tName, tAge, tNationality, tSalary, tSchoolName);
                System.out.println("Teacher Created Successfully");
                System.out.print("\033[H\033[2J");  
                System.out.flush();
            }else if(input == 3){
                ac = new Scanner(System.in);
                System.out.print("Name: ");
                String searchName = ac.nextLine();
                Human result = operation.searchByName(searchName);
                if(result != null){
                    System.out.println(result);
                }else{
                    System.out.println("Not found!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                }
            }else if(input == 4){
                ac = new Scanner(System.in);
                System.out.print("Name: ");
                String name = ac.nextLine();
                Human result = operation.searchByName(name);
                if(result != null){
                    if(result instanceof Student){
                        System.out.print("Student Age: ");
                        String age = ac.nextLine();
                        System.out.print("Student Nationality: ");
                        String nationality = ac.nextLine();
                        System.out.print("Student School Name: ");
                        String schoolName = ac.nextLine();
                        System.out.print("Student Skill: ");
                        String skill = ac.nextLine();
                        operation.editByName(name, age, nationality, schoolName, skill);
                        System.out.println("Edit Successfully");
                    }else{
                        System.out.print("Teacher Age: ");
                        String age = ac.nextLine();
                        System.out.print("Teacher Nationality: ");
                        String nationality = ac.nextLine();
                        System.out.print("Teacher School Name: ");
                        String schoolName = ac.nextLine();
                        System.out.print("Teacher Salary: ");
                        Double salary = ac.nextDouble();
                        operation.editByName(name, age, nationality, salary, schoolName);
                        System.out.println("Edit Successfully");
                    }
                }else{
                    System.out.println("Not found!");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\033[H\033[2J");  
                System.out.flush();
            }else if(input ==5){
                break;
            }else{
                System.out.println("Invalide Input. Please try again");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("\033[H\033[2J");  
                System.out.flush();
            }  
        }
        ac.close();
    }

    public static void printMenu(){
        System.out.println("----Menu----");
        System.out.println("1: Add Student");
        System.out.println("2: Add Teacher");
        System.out.println("3: Search by Name");
        System.out.println("4: Edit by Name");
        System.out.println("5: Exit");
        System.out.println("------------");
    }
}
