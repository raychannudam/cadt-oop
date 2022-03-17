package Dara.Lab2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the gender: ");
        String gender = scanner.next();
        System.out.print("Enter the maritial status: ");
        String status = scanner.next();
        scanner.close();
        System.out
                .println((gender.equalsIgnoreCase("female") && status.equalsIgnoreCase("single")) ? "Hello Miss." + name
                        : (gender.equalsIgnoreCase("female") && status.equalsIgnoreCase("married") ? "Hello Ms." + name
                        : "Hello Mr." + name));
    }
}
