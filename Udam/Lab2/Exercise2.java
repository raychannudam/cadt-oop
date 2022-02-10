package Udam.Lab2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int number[] = new int[3];
        int maxNumber = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<number.length; i++){
            System.out.print("number1: ");
            number[i] = sc.nextInt();
        }
        for(int i=0; i<number.length; i++){
            for (int j=i+1; j<number.length; j++){
                maxNumber = Math.max(number[i], number[j]);
            }
        }
        System.out.println(maxNumber);
    }
    
}
