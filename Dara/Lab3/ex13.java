package Dara.Lab3;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        String[] name = new String[15];
        Scanner inputName = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            name[i] = inputName.nextLine();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + " " + name[i]);
        }
    }
} 
