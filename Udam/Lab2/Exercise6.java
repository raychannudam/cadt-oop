package Udam.Lab2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        String input = ac.nextLine();
        switch (input) {
            case "a":
                System.out.print("apple");
                break;
            case "b":
                System.out.println("boy");
                break;
            case "c":
                System.out.println("cat");
                break;
            case "d":
                System.out.println("dog");
                break;
            case "e":
                System.out.println("egg");
                break;
            case "f":
                System.out.println("fan");
                break;
            case "g":
                System.out.println("game");
                break;
            case "h":
                System.out.println("hot");
                break;
            case "i":
                System.out.println("insect");
                break;
            case "j":
                System.out.println("juice");
                break;
            case "k":
                System.out.println("kick");
                break;
            default:
                System.out.println("Out of scope");
                break;
        }
    }
}
