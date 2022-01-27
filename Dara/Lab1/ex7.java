import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        float a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for second number: ");
        a = input.nextFloat();
        System.out.print("Enter value for second number: ");
        b = input.nextFloat();
        input.close();
        System.out.println(a+b);
    }
}
