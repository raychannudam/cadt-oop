package Udam.Lab6.Exercise4;

import java.util.Scanner;

import Udam.Lab6.Exercise3.MyShape;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyShapeOp operation = new MyShapeOp();
        Scanner ac = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.print("Choose an option: ");
            int input = ac.nextInt();
            if (input == 1) {
                ac = new Scanner(System.in);
                System.out.print("Width: ");
                Double width = ac.nextDouble();
                System.out.print("Height: ");
                Double height = ac.nextDouble();
                operation.addShape(width, height);
                Thread.sleep(1000);
                System.out.println("Rectangle Created Successfully");
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else if (input == 2) {
                ac = new Scanner(System.in);
                System.out.print("Radius: ");
                Double radius = ac.nextDouble();
                System.out.println("Circle Created Successfully");
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                operation.addShape(radius);
            } else if (input == 3) {
                ac = new Scanner(System.in);
                System.out.print("Area: ");
                Double area = ac.nextDouble();
                MyShape result = operation.searchShape(area);
                if (result != null) {
                    System.out.println(result);
                } else {
                    System.out.println("Not found!");
                    System.out.print("\033[H\033[2J");
                    Thread.sleep(1000);
                    System.out.flush();
                }
            } else if (input == 4) {
                operation.printAll();
            } else if (input == 5) {
                break;
            } else {
                System.out.println("Invalide input, Please try again!");
                Thread.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
        ac.close();
    }

    public static void printMenu() {
        System.out.println("----Menu----");
        System.out.println("1. Add Rectangle");
        System.out.println("2. Add Circle");
        System.out.println("3. Search");
        System.out.println("4. Print All");
        System.out.println("5. Exit");
        System.out.println("----Menu----");
    }
}
