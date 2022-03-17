package Dara.Lab1;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        String userInput;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter anything you'd like: ");
        userInput = input.nextLine();
        input.close();

        System.out.println("User output: " + userInput);
    }
}
