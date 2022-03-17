package ex8;

import java.util.Scanner;

public class MainDog{
    static void fillData(Dog[] dog) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < dog.length; i++) {
            System.out.print("Enter the Weight: ");
            dog[i].setWeight(input.nextInt());
            System.out.print("Enter the name: ");
            input.nextLine();
            dog[i].setName(input.nextLine());
        }
        input.close();
    }
    static void printAll(Dog[] stundents) {
        for (Dog dog : stundents) {
            System.out.println(dog + " ");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();

        Dog[] dogs= {dog, dog1};
        fillData(dogs);
        printAll(dogs);
        
    }
}