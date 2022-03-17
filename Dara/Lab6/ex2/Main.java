package ex2;

import java.util.Scanner;

import ex1.Human;
import ex1.Student;
import ex1.Teacher;

public class Main {
    static int i = 0;

    public static void main(String[] args) {
        Human humans[] = new Human[10];
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.Add Student");
            System.out.println("2.Add Techer");
            System.out.println("3.Search by name");
            System.out.println("4.Edit by name");
            System.out.println("5.Print all");
            System.out.println("6.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    if (i != 10) {
                        humans[i] = Student.addData();
                        i++;
                    } else
                        System.out.println("The array is full");
                }
                    break;
                case 2: {
                    if (i != 10) {
                        humans[i] = Teacher.addData();
                        i++;
                    } else
                        System.out.println("The array is full");
                }
                    break;
                case 3: {
                    searchName(humans);
                }
                    break;
                case 4: {
                    editByName(humans);
                }
                    break;
                case 5: {
                    for (Human human : humans) {
                        System.out.println(human);
                    }
                }
                    break;
                case 6: {
                    System.exit(0);
                }
                    break;
                default: {
                    System.out.println("default");
                }
                    break;
            }
            // input.close();
        } while (choice != 6);
    }

    static void searchName(Human humans[]) {
        Scanner searchName = new Scanner(System.in);
        System.out.println("Enter the name to be searched: ");
        String name = searchName.nextLine();
        boolean flag = false;
        int j;
        for (j = 0; j < humans.length; j++) {
            if (humans[j].getName().equalsIgnoreCase(name)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(humans[j]);
        } else {
            System.out.println("User not found!");
        }
    }

    static void editByName(Human humans[]) {
        Scanner searchName = new Scanner(System.in);
        System.out.println("Enter the name to be edited: ");
        String name = searchName.nextLine();
        boolean flag = false;
        int j;
        for (j = 0; j < humans.length; j++) {
            if (humans[j].getName().equalsIgnoreCase(name)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("***********Editing**************");
            if (humans[j] instanceof Student) {
                humans[j] = Student.addData();
            } else {
                humans[j] = Teacher.addData();
            }
        } else {
            System.out.println("User not found!");
        }
    }
}
