package Udam.Lab1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number of pounds: ");
        float pounds = scan.nextFloat();
        float kilograms = pounds * 0.454f;
        System.out.println("The result is: " + kilograms + " kg");
    }
}


