package Lab1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter number of feet: ");
        Float feet = scan.nextFloat();

        Float meter = 0.305f * feet;

        System.out.println("The result is: " + meter + " m");
    }
}

