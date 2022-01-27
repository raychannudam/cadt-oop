package Lab1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radious: ");
        float radius = scan.nextFloat();
        System.out.println("Area = " + ((radius * radius) * 3.14));

    }
}

