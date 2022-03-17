package Udam.Lab6.Exercise7;

import Udam.Lab6.Exercise6.Human;

import java.util.Scanner;

import Udam.Lab6.Exercise6.DoAble;

public class Main {
    public static void main(String[] args) {
        DoAble doAbleList[] = new DoAble[10];
        Scanner ac = new Scanner(System.in);
        for (DoAble doAble : doAbleList) {
            ac = new Scanner(System.in);
            System.out.print("Name: ");
            String name = ac.nextLine();
            System.out.print("Age: ");
            Integer age = Integer.parseInt(ac.nextLine());
            System.out.print("Nationality: ");
            String nationality = ac.nextLine();
            doAble = new Human(name, age, nationality);
        }
        ac.close();
    }
}
