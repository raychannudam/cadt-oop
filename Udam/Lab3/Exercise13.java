package Udam.Lab3;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        String[] nameList = new String[15];
        for(int i=0; i<nameList.length; i++){
            System.out.print("Input name: ");
            String name = ac.nextLine();
            nameList[i] = name;
        }
        for(String index: nameList) System.out.print(index + " ");
        System.out.println();
    }
}
