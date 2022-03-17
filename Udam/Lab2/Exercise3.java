package Udam.Lab2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Input age: ");
        age = sc.nextInt();
        if (age <= 0) {
            System.out.println("The age cannot be less then 0");
        } else {
            System.out.println("your age is " + age + " years old");
        }
    }
}

