package Udam.Lab2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        System.out.print("Input your score: ");
        score = sc.nextInt();
        if (score >= 0 && score <= 54) {
            System.out.println("F");
        } else if (score >= 55 && score <= 73) {
            System.out.println("D");
        } else if (score >= 74 && score <= 79) {
            System.out.println("C");
        } else if (score >= 80 && score <= 94) {
            System.out.println("B");
        } else if (score >= 95 && score <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid");
        }
    }
}
