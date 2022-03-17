package Udam.Lab4.Exercise10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer[] computerList = new Computer[2];
        Scanner ac = new Scanner(System.in);
        for (int i = 0; i < computerList.length; i++) {
            ac = new Scanner(System.in);
            System.out.println("------------");
            System.out.print("BRAND: ");
            String brand = ac.nextLine();
            System.out.print("MODEL: ");
            String model = ac.nextLine();
            System.out.print("RAM SIZE: ");
            int ramSize = ac.nextInt();
            System.out.print("HDD SIZE: ");
            int hddSize = ac.nextInt();
            computerList[i] = new Computer(brand, model, ramSize, hddSize);
        }
        ac.close();
    }
}
