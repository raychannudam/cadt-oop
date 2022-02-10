package Udam.Lab2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = ac.nextLine();
        System.out.print("Input gender: ");
        String gender = ac.nextLine();
        System.out.print("Input status: ");
        String status = ac.nextLine();

        if(gender.equals("F") || gender.equals("f")){
            if(status.equals("single")){
                System.out.println("Hello Miss. " + name);
            }else{
                System.out.println("Hello Ms. " + name);
            }   
        }else{
            System.out.println("Hello Mr. " + name);
        }
    }
}
