import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        float feet, meter;
        System.out.print("Enter the feets: ");
        Scanner input = new Scanner(System.in);
        feet = input.nextFloat();
        meter = 0.305f * feet;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println(feet + " feets equals to " + df.format(meter) + " meters");

        // int principal;
        // float monthlyInterest;
        // int numberOfPayements;
        // float Mortgage;
        // final byte MONTH_IN_YEAR = 12;
        // final byte PERCENT = 100;
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Pricipal: ");
        // principal = scanner.nextInt();

        // System.out.print("Annual Interest Rate: ");
        // monthlyInterest = scanner.nextFloat();

        // System.out.print("Period (Years): ");
        // numberOfPayements = scanner.nextInt();

        // scanner.close();

        // monthlyInterest = monthlyInterest / PERCENT / MONTH_IN_YEAR;
        // System.out.println(monthlyInterest);
        // float power = (float) Math.pow(1 + monthlyInterest, numberOfPayements);

        // Mortgage = (principal * monthlyInterest * power) / power - 1;

        // System.out.println("Mortgage: " +
        // NumberFormat.getCurrencyInstance().format(Mortgage));
        // // System.out.println("Mortgage: $" + M);

    }
}