package Udam.Lab4.Exercise9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        Scanner ac = new Scanner(System.in);
        for (int i = 0; i < dogs.length; i++) {
            ac = new Scanner(System.in);
            System.out.println("-----------");
            System.out.print("NAME: ");
            String name = ac.nextLine();
            System.out.print("WEIGHT: ");
            Double weight = ac.nextDouble();
            dogs[i] = new Dog(name, weight);

        }
        ac.close();
        for (Dog dog : dogs) {
            dog.printInfo();
        }
    }
}
