package Udam.Lab3;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int[] intArray = new int[5];
        for(int i=0; i<intArray.length; i++){
            System.out.print("Input a num: ");
            int number = ac.nextInt();
            intArray[i] = number;
        }
        for(int i=0; i<intArray.length; i++) System.out.print(intArray[i] + ", ");
    }
}
