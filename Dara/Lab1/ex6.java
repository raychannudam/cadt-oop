import java.text.DecimalFormat;
import java.util.Scanner;

public class ex6 {
    float feet, meter;

    public static void main(String[] args) {
        float pound, kg;
        System.out.print("Enter the pounds ");
        Scanner input = new Scanner(System.in);
        pound = input.nextFloat();
        input.close();
        kg = 0.454f * pound;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println(pound + " pounds equals to " + df.format(kg) + " kilograms.");
    }
}
