package ex10;
import java.util.Scanner;
public class MainComputer {
    static void fillData(Computer[] computers){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < computers.length; i++) {
            System.out.print("Enter the Brand: ");
            computers[i].setBrand(input.next());
            System.out.print("Enter the Model: ");
            input.nextLine();
            computers[i].setModel(input.nextLine());
            System.out.print("Enter the ram: ");
            computers[i].setRamSize(input.next());
            System.out.print("Enter the storage: ");
            input.nextLine();
            computers[i].setStorageSize(input.next());
        }
        input.close();
    }

    static void printAll(Computer[] stundents) {
        for (Computer computer : stundents) {
            System.out.println(computer + " ");
        }
    }
    public static void main(String[] args) {
        Computer Computer1 = new Computer();
        Computer Computer2 = new Computer();

        Computer[] Computers= {Computer1, Computer2};
        fillData(Computers);
        printAll(Computers);
    }
}
