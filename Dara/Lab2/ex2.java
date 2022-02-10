package Dara.Lab2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value c: ");
        int c = scanner.nextInt();
        scanner.close();

        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
