package Lab1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fullname: ");
        String fullname = scan.nextLine();
        System.out.print("age: ");
        Short age = Short.parseShort(scan.nextLine());
        System.out.print("address: ");
        String address = scan.nextLine();
        System.out.println("fullname: " + fullname);
        System.out.println("age: " + age);
        System.out.println("address: " + address);
    }
}
