package Udam.Lab3;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        double[] intArray = new double[6];
        for(int i=0; i<intArray.length; i++){
            System.out.print("Input a num: ");
            double number = ac.nextDouble();
            intArray[i] = number;
        }
        for(int i=0; i<intArray.length; i++) System.out.print(intArray[i] + ", ");
    }
}
