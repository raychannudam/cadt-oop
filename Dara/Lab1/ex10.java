package Dara.Lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        input.close();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The circle with radius" + radius +
                " has an area of : " + df.format(area));

        System.out.println("The circle with radius" + radius +
                " has a perimeter of : " + df.format(perimeter));

    }
}
