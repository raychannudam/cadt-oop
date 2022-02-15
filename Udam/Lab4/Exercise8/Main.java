package Udam.Lab4.Exercise8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        Scanner ac = new Scanner(System.in);
        for(int i=0; i<dogs.length; i++){
            System.out.println("**********");
            ac = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = ac.nextLine();
            System.out.print("Input weight: ");
            Double weight = ac.nextDouble();
            dogs[i] = new Dog(name, weight);
        }
        ac.close();
        for(Dog dog: dogs){
            dog.printInfo();
        }
    }
}
