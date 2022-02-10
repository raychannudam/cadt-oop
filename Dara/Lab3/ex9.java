package Dara.Lab3;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter value of " + i + " :");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
